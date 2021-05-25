import controller.BookingController;
import model.emun.TPClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class StartupTest {

    BookingController bookingController = new BookingController();
    String bestBooking;

    @Test
    public void booking1Test() {

        bestBooking = bookingController.findBestHotel(TPClient.REGULAR, LocalDate.parse("2020-03-16"), LocalDate.parse("2020-03-17"), LocalDate.parse("2020-03-18"));
        Assertions.assertEquals("Parque das flores", bestBooking);

    }

    @Test
    public void booking2Test() {

        bestBooking = bookingController.findBestHotel(TPClient.REGULAR, LocalDate.parse("2020-03-20"), LocalDate.parse("2020-03-21"), LocalDate.parse("2020-03-22"));
        Assertions.assertEquals("Jardim Botânico", bestBooking);
    }

    @Test
    public void booking3Test() {

        bestBooking = bookingController.findBestHotel(TPClient.FIDELITY, LocalDate.parse("2020-03-26"), LocalDate.parse("2020-03-27"), LocalDate.parse("2020-03-28"));
        Assertions.assertEquals("Mar Atlântico", bestBooking);
    }


}
