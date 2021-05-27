package controller;

import service.BookingServiceImpl;
import service.Interface.BookingService;
import model.emun.ClientType;

import java.time.LocalDate;

public class BookingController {

    private final BookingService bookingService;

    public BookingController() {
        this.bookingService = new BookingServiceImpl();
    }


    public String findByHotelWithBetterValueAndRank(ClientType tpClient, LocalDate... dates) {
        return this.bookingService.findByHotelWithBetterValueAndRank(tpClient, dates);
    }
}
