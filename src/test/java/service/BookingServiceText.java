package service;

import model.BestHotelVO;
import model.Booking;
import model.Hotel;
import model.emun.ClientType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookingServiceText {

    private static BookingServiceImpl bookingService;
    private static HotelServiceImpl hotelService;

    final String PARQUE_DAS_FLORES = "Parque das flores";
    final String JARDIN_BOTANICO = "Jardim Botânico";
    final String MAR_ATLANTICO = "Mar Atlântico";

    List<Booking> bookingList = new ArrayList<>();
    List<Hotel> hotelList = new ArrayList<>();

    @BeforeAll
    public static void setup() {
        bookingService = new BookingServiceImpl();
        hotelService = new HotelServiceImpl();
    }

    @Test
    public void checkCorrectScenarioOfTheBestBooking() {

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

        hotelList = hotelService.loadPreConfiguredHotelList();
        bookingService.loadHotelInformationOnBooking(bookingList, hotelList);

        Assertions.assertEquals(0d, bookingList.get(0).getTotalPriceToRegularClientOnWeekDays());
        Assertions.assertEquals(0d, bookingList.get(0).getTotalPriceToFidelityClientOnyWeekDays());
        Assertions.assertEquals(0d, bookingList.get(0).getTotalPriceToRegularClientOnWeekendDays());
        Assertions.assertEquals(0d, bookingList.get(0).getTotalPriceToFidelityClientOnWeekendDays());

        Assertions.assertEquals(0d, bookingList.get(1).getTotalPriceToRegularClientOnWeekDays());
        Assertions.assertEquals(0d, bookingList.get(1).getTotalPriceToFidelityClientOnyWeekDays());
        Assertions.assertEquals(0d, bookingList.get(1).getTotalPriceToRegularClientOnWeekendDays());
        Assertions.assertEquals(0d, bookingList.get(1).getTotalPriceToFidelityClientOnWeekendDays());

        Assertions.assertEquals(0d, bookingList.get(2).getTotalPriceToRegularClientOnWeekDays());
        Assertions.assertEquals(0d, bookingList.get(2).getTotalPriceToFidelityClientOnyWeekDays());
        Assertions.assertEquals(0d, bookingList.get(2).getTotalPriceToRegularClientOnWeekendDays());
        Assertions.assertEquals(0d, bookingList.get(2).getTotalPriceToFidelityClientOnWeekendDays());
    }

    @Test
    public void checkBestHotelWithBestValue() {

        hotelList = hotelService.loadPreConfiguredHotelList();
        bookingService.loadHotelInformationOnBooking(bookingList, hotelList);

        bookingList.forEach(x -> {
            x.setTotalPriceToFidelityClientOnWeekendDays(
                    Double.sum(x.getHotel().getPriceToClientOnFidelityWeekendDays(),
                            x.getTotalPriceToFidelityClientOnWeekendDays()));
        });

        var minBooking = bookingService.getBestHotelWithMinValue(bookingList);
        Assertions.assertEquals(MAR_ATLANTICO, minBooking);
    }

    @Test
    public void checkBestHotelWithValueDuplicateWithBestValueAndRank() {

        hotelList = hotelService.loadPreConfiguredHotelList();
        var bestHotelList = Arrays.asList(
                new BestHotelVO(hotelList.get(0), 100d),
                new BestHotelVO(hotelList.get(1), 100d),
                new BestHotelVO(hotelList.get(2), 100d));

        var bestHotelValueMinAndRank =
                bookingService.getBestHotelWithValueDuplicateWithBestValueAndRank(bestHotelList, bestHotelList.get(1));

        Assertions.assertEquals(MAR_ATLANTICO, bestHotelValueMinAndRank);
    }


}
