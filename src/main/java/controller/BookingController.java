package controller;

import Service.BookingServiceImpl;
import Service.Interface.BookingService;
import model.emun.TPClient;

import java.time.LocalDate;

public class BookingController {

    private final BookingService bookingService;

    public BookingController() {
        this.bookingService = new BookingServiceImpl();
    }


    public String findBestHotel(TPClient tpClient, LocalDate... dates) {
        return this.bookingService.findByHotel(tpClient, dates);
    }
}
