package service;

import model.emun.HotelName;
import service.Interface.HotelService;
import model.Hotel;
import model.emun.Ranks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class HotelServiceTest {

    private static HotelService service;

    @BeforeAll
    public static void setup() {
        service = new HotelServiceImpl();
    }

    @Test
    public void checkPreConfiguredHotelList() {

        List<Hotel> hotelList = new ArrayList<>();
        hotelList = service.loadPreConfiguredHotelList();

        Assertions.assertEquals(HotelName.PARQUE_DAS_FLORES.getValue(), hotelList.get(0).getName());
        Assertions.assertEquals(Ranks.RANK_THREE, hotelList.get(0).getRank());
        Assertions.assertEquals(110, hotelList.get(0).getPriceToClientOnRegularWeekDays());
        Assertions.assertEquals(80, hotelList.get(0).getPriceToClientOnFidelityWeekDays());
        Assertions.assertEquals(90, hotelList.get(0).getPriceToClientOnRegularWeekendDays());
        Assertions.assertEquals(80, hotelList.get(0).getPriceToClientOnFidelityWeekendDays());

        Assertions.assertEquals(HotelName.JARDIN_BOTANICO.getValue(), hotelList.get(1).getName());
        Assertions.assertEquals(Ranks.RANK_FOUR, hotelList.get(1).getRank());
        Assertions.assertEquals(160, hotelList.get(1).getPriceToClientOnRegularWeekDays());
        Assertions.assertEquals(110, hotelList.get(1).getPriceToClientOnFidelityWeekDays());
        Assertions.assertEquals(60, hotelList.get(1).getPriceToClientOnRegularWeekendDays());
        Assertions.assertEquals(50, hotelList.get(1).getPriceToClientOnFidelityWeekendDays());

        Assertions.assertEquals(HotelName.MAR_ATLANTICO.getValue(), hotelList.get(2).getName());
        Assertions.assertEquals(Ranks.RANK_FIVE, hotelList.get(2).getRank());
        Assertions.assertEquals(220, hotelList.get(2).getPriceToClientOnRegularWeekDays());
        Assertions.assertEquals(100, hotelList.get(2).getPriceToClientOnFidelityWeekDays());
        Assertions.assertEquals(150, hotelList.get(2).getPriceToClientOnRegularWeekendDays());
        Assertions.assertEquals(40, hotelList.get(2).getPriceToClientOnFidelityWeekendDays());
    }
}
