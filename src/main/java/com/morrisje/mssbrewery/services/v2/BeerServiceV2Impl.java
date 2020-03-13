package com.morrisje.mssbrewery.services.v2;

import com.morrisje.mssbrewery.web_models.BeerDto;
import com.morrisje.mssbrewery.web_models.v2.BeerDtoV2;
import com.morrisje.mssbrewery.web_models.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting V2 Beer");
    }

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
    return BeerDtoV2.builder().id(UUID.randomUUID())
            .beerName("Bud Light")
            .beerStyle(BeerStyleEnum.ALE)
            .upc(123456789l)
            .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDtoV2) {
        return BeerDtoV2.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDtoV2) {

    }
}
