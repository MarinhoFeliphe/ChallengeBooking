import Service.BookingServiceImpl;
import Service.Interface.BookingService;
import model.emun.TPClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class StartupTest {

    BookingService service = new BookingServiceImpl();
    String bestBooking;

    @Test
    public void booking1Test() {

        bestBooking = service.findByHotel(TPClient.REGULAR, LocalDate.parse("2020-03-16"), LocalDate.parse("2020-03-17"), LocalDate.parse("2020-03-18"));
        Assertions.assertEquals("Parque das flores", bestBooking);

    }

    @Test
    public void booking2Test() {

        bestBooking = service.findByHotel(TPClient.REGULAR, LocalDate.parse("2020-03-20"), LocalDate.parse("2020-03-21"), LocalDate.parse("2020-03-22"));
        Assertions.assertEquals("Jardim Botânico", bestBooking);
    }

    @Test
    public void booking3Test() {

        bestBooking = service.findByHotel(TPClient.FIDELITY, LocalDate.parse("2020-03-26"), LocalDate.parse("2020-03-27"), LocalDate.parse("2020-03-28"));
        Assertions.assertEquals("Mar Atlântico", bestBooking);
    }


}
