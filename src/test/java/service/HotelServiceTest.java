package service;

import model.emun.HotelName;
import service.Interface.HotelService;
import model.Hotel;
import model.emun.Ranks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HotelServiceTest {

    private static HotelService service;

    @BeforeAll
    public static void setup() {
        service = new HotelServiceImpl();
    }

    @Test
    public void checkPreConfiguredHotelList() {

        List<Hotel> hotels = service.loadPreConfiguredHotelList();

        Assertions.assertEquals(HotelName.PARQUE_DAS_FLORES.getValue(), hotels.get(0).getName());
        Assertions.assertEquals(Ranks.RANK_THREE, hotels.get(0).getRank());
        Assertions.assertEquals(110, hotels.get(0).getRegularPriceOnWeekdays());
        Assertions.assertEquals(80, hotels.get(0).getFidelityPriceOnWeekdays());
        Assertions.assertEquals(90, hotels.get(0).getRegularPriceOnWeekend());
        Assertions.assertEquals(80, hotels.get(0).getFidelityPriceOnWeekend());

        Assertions.assertEquals(HotelName.JARDIN_BOTANICO.getValue(), hotels.get(1).getName());
        Assertions.assertEquals(Ranks.RANK_FOUR, hotels.get(1).getRank());
        Assertions.assertEquals(160, hotels.get(1).getRegularPriceOnWeekdays());
        Assertions.assertEquals(110, hotels.get(1).getFidelityPriceOnWeekdays());
        Assertions.assertEquals(60, hotels.get(1).getRegularPriceOnWeekend());
        Assertions.assertEquals(50, hotels.get(1).getFidelityPriceOnWeekend());

        Assertions.assertEquals(HotelName.MAR_ATLANTICO.getValue(), hotels.get(2).getName());
        Assertions.assertEquals(Ranks.RANK_FIVE, hotels.get(2).getRank());
        Assertions.assertEquals(220, hotels.get(2).getRegularPriceOnWeekdays());
        Assertions.assertEquals(100, hotels.get(2).getFidelityPriceOnWeekdays());
        Assertions.assertEquals(150, hotels.get(2).getRegularPriceOnWeekend());
        Assertions.assertEquals(40, hotels.get(2).getFidelityPriceOnWeekend());
    }
}
