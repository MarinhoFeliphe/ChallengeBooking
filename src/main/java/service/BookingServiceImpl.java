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

public class BookingServiceImpl implements BookingService {

    HotelService service = new HotelServiceImpl();

    public String findByHotelWithBetterValueAndRank(ClientType clientType, LocalDate... dates) {
        List<Booking> bookingList = new ArrayList<>();

        List<Hotel> hotelList = service.loadPreConfiguredHotelList();

        this.loadHotelInformationOnBooking(bookingList, hotelList);

        Arrays.asList(dates).forEach(dateBooking -> {

            bookingList.forEach(booking -> {
                boolean isWeekend = DataUtils.getIsWeekend(dateBooking);
                if (isWeekend) {
                    if (clientType.equals(ClientType.REGULAR)) {
                        booking.setTotalPriceToRegularClientOnWeekendDays(Double.sum(booking.getTotalPriceToRegularClientOnWeekendDays(), booking.getHotel().getPriceToClientOnRegularWeekendDays()));
                    } else {
                        booking.setTotalPriceToFidelityClientOnWeekendDays(Double.sum(booking.getTotalPriceToFidelityClientOnWeekendDays(), booking.getHotel().getPriceToClientOnFidelityWeekendDays()));
                    }
                } else {
                    if (clientType.equals(ClientType.REGULAR)) {
                        booking.setTotalPriceToRegularClientOnWeekDays(Double.sum(booking.getTotalPriceToRegularClientOnWeekDays(), booking.getHotel().getPriceToClientOnRegularWeekDays()));
                    } else {
                        booking.setTotalPriceToFidelityClientOnyWeekDays(Double.sum(booking.getTotalPriceToFidelityClientOnyWeekDays(), booking.getHotel().getPriceToClientOnFidelityWeekDays()));
                    }
                }
            });
        });

        return this.getBestHotelWithMinValue(bookingList);
    }

    protected void loadHotelInformationOnBooking(List<Booking> bookingList, List<Hotel> hotelList) {
        hotelList.forEach(hotel -> {
            bookingList.add(new Booking(hotel, 0d, 0d, 0d, 0d));
        });
    }

    protected String getBestHotelWithMinValue(List<Booking> bookingList) {

        var totalValuesPerHotelList = bookingList.stream()
                .map(booking -> {
                    return new BestHotelVO(booking.getHotel(), booking.getTotalPriceToRegularClientOnWeekDays() + booking.getTotalPriceToFidelityClientOnyWeekDays()
                            + booking.getTotalPriceToRegularClientOnWeekendDays() + booking.getTotalPriceToFidelityClientOnWeekendDays());
                })
                .collect(Collectors.toList());

        var bestMinHotelValue = totalValuesPerHotelList.stream()
                .min(Comparator.comparing(BestHotelVO::getPriceToClientTotalDays)).get();

        return getBestHotelWithValueDuplicateWithBestValueAndRank(totalValuesPerHotelList, bestMinHotelValue);

    }

    protected String getBestHotelWithValueDuplicateWithBestValueAndRank(List<BestHotelVO> totalValuesPerHotelList, BestHotelVO bestMinHotelValue) {

        var HotelsWithTheSameValueList = totalValuesPerHotelList.stream()
                .filter(hotelsWithTheSameValueList ->
                        !hotelsWithTheSameValueList.equals(bestMinHotelValue) &&
                                hotelsWithTheSameValueList.getPriceToClientTotalDays().equals(bestMinHotelValue.getPriceToClientTotalDays()))
                .collect(Collectors.toList());

        if (HotelsWithTheSameValueList != null && !HotelsWithTheSameValueList.isEmpty()) {
            HotelsWithTheSameValueList.add(bestMinHotelValue);
            var highestRankedHotel = HotelsWithTheSameValueList.stream()
                    .max(Comparator.comparing(x -> x.getHotel().getRank()))
                    .get();

            return highestRankedHotel.getHotel().getName();
        }
        return bestMinHotelValue.getHotel().getName();
    }
}
