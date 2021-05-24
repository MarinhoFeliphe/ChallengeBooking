package Service;

import Service.Interface.BookingService;
import Util.DataUtils;
import model.BestHotel;
import model.Booking;
import model.Hotel;
import model.emun.TPClient;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class BookingServiceImpl implements BookingService {

    @Override
    public String findByHotel(TPClient tpClient, LocalDate... dates) {
        HotelServiceImpl service = new HotelServiceImpl();
        List<Booking> bookingList = new ArrayList<>();

        Calendar calendar = Calendar.getInstance();
        List<Hotel> hotelList = service.loadHotel();

        hotelList.forEach(hotel -> {
            bookingList.add(new Booking(hotel, 0d, 0d, 0d, 0d));
        });

        Arrays.asList(dates).forEach(dateBooking -> {

            bookingList.forEach(reserva -> {
                boolean isWeekend = DataUtils.getIsWeekend(dateBooking);
                if (isWeekend) {
                    if (tpClient.equals(TPClient.REGULAR)) {
                        reserva.setSumRegularWeekend(Double.sum(reserva.getSumRegularWeekend(), reserva.getHotel().getRegularWeekend()));
                    } else {
                        reserva.setSumFidelityWeekend(Double.sum(reserva.getSumFidelityWeekend(), reserva.getHotel().getFidelityWeekend()));
                    }
                } else {
                    if (tpClient.equals(TPClient.REGULAR)) {
                        reserva.setSumRegularWeek(Double.sum(reserva.getSumRegularWeek(), reserva.getHotel().getRegularWeek()));
                    } else {
                        reserva.setSumFidelityWeek(Double.sum(reserva.getSumFidelityWeek(), reserva.getHotel().getFidelityWeek()));
                    }
                }
            });
        });

        return bestHorel(bookingList);
    }

    private String bestHorel(List<Booking> bookingList) {

        var bestHotelList = bookingList.stream()
                .map(booking -> {
                    return new BestHotel(booking.getHotel(), booking.getSumRegularWeek() + booking.getSumFidelityWeek()
                            + booking.getSumRegularWeekend() + booking.getSumFidelityWeekend());
                })
                .collect(Collectors.toList());

        var bestHotel = bestHotelList.stream()
                .min(Comparator.comparing(BestHotel::getValorTotal)).get();

        return bestHotelRank(bestHotelList, bestHotel);

    }

    private String bestHotelRank(List<BestHotel> bestHotelEmpatado, BestHotel bestHotel) {

        var hotelEmpatado = bestHotelEmpatado.stream()
                .filter(bestHotelEMP -> !bestHotelEMP.equals(bestHotel) && bestHotelEMP.getValorTotal().equals(bestHotel.getValorTotal()))
                .collect(Collectors.toList());

        if (hotelEmpatado != null && !hotelEmpatado.isEmpty()) {
            hotelEmpatado.add(bestHotel);
            var bestHotelRank = hotelEmpatado.stream()
                    .max(Comparator.comparing(x -> x.getHotel().getRank()))
                    .get();

            return bestHotelRank.getHotel().getName();
        }
        return bestHotel.getHotel().getName();
    }
}
