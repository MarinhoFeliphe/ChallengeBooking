package service;

import service.Interface.BookingService;
import service.Interface.HotelService;
import model.Booking;
import model.Hotel;
import model.emun.ClientType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingServiceText {

    private static BookingService bookingService;
    private static HotelService hotelService;


    @BeforeAll
    public static void setup() {
        bookingService = new BookingServiceImpl();
        hotelService = new HotelServiceImpl();
    }

    @Test
    public void checkCorrectScenarioOfTheBestBooking() {

        final String PARQUE_DAS_FLORES = "Parque das flores";
        final String JARDIN_BOTANICO = "Jardim Botânico";
        final String MAR_ATLANTICO = "Mar Atlântico";

        String bestBooking;

        bestBooking = bookingService.findByHotelWithBetterValueAndRank(ClientType.REGULAR, LocalDate.parse("2020-03-16"), LocalDate.parse("2020-03-17"), LocalDate.parse("2020-03-18"));
        Assertions.assertEquals(PARQUE_DAS_FLORES, bestBooking);

        bestBooking = bookingService.findByHotelWithBetterValueAndRank(ClientType.REGULAR, LocalDate.parse("2020-03-20"), LocalDate.parse("2020-03-21"), LocalDate.parse("2020-03-22"));
        Assertions.assertEquals(JARDIN_BOTANICO, bestBooking);

        bestBooking = bookingService.findByHotelWithBetterValueAndRank(ClientType.FIDELITY, LocalDate.parse("2020-03-26"), LocalDate.parse("2020-03-27"), LocalDate.parse("2020-03-28"));
        Assertions.assertEquals(MAR_ATLANTICO, bestBooking);
    }

    @Test
    public void checkVerifyThatTheReservationWasLoadedWithInformationFromTheHotel() {
        List<Booking> bookingList = new ArrayList<>();
        List<Hotel > hotelList = new ArrayList<>();

        hotelList = hotelService.loadPreConfiguredHotelList();
        //bookingService.

    }


}
