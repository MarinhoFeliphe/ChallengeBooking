import controller.BookingController;
import model.emun.ClientType;

import java.time.LocalDate;

public class Startup {


    public static void main(String[] args) {

        BookingController bookingController = new BookingController();

        var bestBooking = bookingController.findByHotelWithBetterValueAndRank(ClientType.REGULAR, LocalDate.parse("2020-03-16"), LocalDate.parse("2020-03-17"), LocalDate.parse("2020-03-18"));
        System.out.println(bestBooking);
    }
}
