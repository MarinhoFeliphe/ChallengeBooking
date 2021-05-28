package service;

import service.Interface.BookingService;
import service.Interface.HotelService;
import Util.DataUtils;
import model.BestHotelVO;
import model.Booking;
import model.Hotel;
import model.emun.ClientType;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookingServiceImpl implements BookingService {

    HotelService service = new HotelServiceImpl();

    public String findByHotelWithBetterValueAndRank(ClientType clientType, LocalDate... dates) {
        List<Booking> bookings = new ArrayList<>();

        List<Hotel> hotels = service.loadPreConfiguredHotelList();

        this.loadHotelInformationOnBooking(bookings, hotels);

        Arrays.asList(dates).forEach(dateBooking -> {

            bookings.forEach(booking -> {
                if (DataUtils.isWeekend(dateBooking)) {
                    if (ClientType.REGULAR.equals(clientType)) {
                        booking.setTotalRegularPriceOnWeekend(Double.sum(booking.getTotalRegularPriceOnWeekend(), booking.getHotel().getRegularPriceOnWeekend()));
                    } else {
                        booking.setTotalFidelityPriceOnWeekend(Double.sum(booking.getTotalFidelityPriceOnWeekend(), booking.getHotel().getFidelityPriceOnWeekend()));
                    }
                } else {
                    if (ClientType.REGULAR.equals(clientType)) {
                        booking.setTotalRegularPriceOnWeekdays(Double.sum(booking.getTotalRegularPriceOnWeekdays(), booking.getHotel().getRegularPriceOnWeekdays()));
                    } else {
                        booking.setTotalFidelityPriceOnWeekdays(Double.sum(booking.getTotalFidelityPriceOnWeekdays(), booking.getHotel().getFidelityPriceOnWeekdays()));
                    }
                }
            });
        });

        return this.getBestHotelWithMinValue(bookings);
    }

    protected void loadHotelInformationOnBooking(List<Booking> bookings, List<Hotel> hotels) {
        hotels.forEach(hotel -> {
            bookings.add(new Booking(hotel, 0d, 0d, 0d, 0d));
        });
    }

    protected String getBestHotelWithMinValue(List<Booking> bookings) {

        var totalValuesPerHotels = bookings.stream()
                .map(BestHotelVO::new)
                .collect(Collectors.toList());

        var lowestHotelPrice = totalValuesPerHotels.stream()
                .min(Comparator.comparing(BestHotelVO::getPriceToClientTotalDays)).get();

        return getBestHotelWithValueDuplicateWithBestValueAndRank(totalValuesPerHotels, lowestHotelPrice);

    }

    protected String getBestHotelWithValueDuplicateWithBestValueAndRank(List<BestHotelVO> totalValuesPerHotelList, BestHotelVO bestMinHotelValue) {

        var HotelsWithTheSameValueList = totalValuesPerHotelList.stream()
                .filter(hotelsWithTheSameValueList ->
                        !hotelsWithTheSameValueList.equals(bestMinHotelValue) &&
                                hotelsWithTheSameValueList.getPriceToClientTotalDays().equals(bestMinHotelValue.getPriceToClientTotalDays()))
                .collect(Collectors.toList());

        if (!HotelsWithTheSameValueList.isEmpty()) {
            HotelsWithTheSameValueList.add(bestMinHotelValue);
            var highestRankedHotel = HotelsWithTheSameValueList.stream()
                    .max(Comparator.comparing(x -> x.getHotel().getRank()))
                    .get();

            return highestRankedHotel.getHotel().getName();
        }
        return bestMinHotelValue.getHotel().getName();
    }
}
