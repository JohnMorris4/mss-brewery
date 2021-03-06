package com.morrisje.mssbrewery.services;

import com.morrisje.mssbrewery.web_models.BeerDto;

import java.util.UUID;


@Deprecated
public interface BeerService {


    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
