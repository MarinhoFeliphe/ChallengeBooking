package service;

import model.Hotel;
import model.emun.HotelName;
import model.emun.Ranks;
import service.Interface.HotelService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelServiceImpl implements HotelService {

    public List<Hotel> loadPreConfiguredHotelList() {
        return new ArrayList<>(Arrays.asList(
                new Hotel(HotelName.PARQUE_DAS_FLORES.getValue(), Ranks.RANK_THREE, 110d, 80d, 90d, 80d),
                new Hotel(HotelName.JARDIN_BOTANICO.getValue(), Ranks.RANK_FOUR, 160d, 110d, 60d, 50d),
                new Hotel(HotelName.MAR_ATLANTICO.getValue(), Ranks.RANK_FIVE, 220d, 100d, 150d, 40d)));
    }

}
