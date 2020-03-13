package com.morrisje.mssbrewery.services.v2;

import com.morrisje.mssbrewery.web_models.BeerDto;
import com.morrisje.mssbrewery.web_models.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    void deleteById(UUID beerId);

    BeerDtoV2 getBeerById(UUID beerIdV2);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2);

    void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2);

}
