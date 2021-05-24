import Service.BookingServiceImpl;
import Service.Interface.BookingService;
import model.emun.TPClient;

import java.time.LocalDate;

public class Startup {


    public static void main(String[] args) {

        BookingService service = new BookingServiceImpl();

        var bestBooking = service.findByHotel(TPClient.REGULAR, LocalDate.parse("2020-03-16"), LocalDate.parse("2020-03-17"), LocalDate.parse("2020-03-18"));
        System.out.println(bestBooking);
    }
}
