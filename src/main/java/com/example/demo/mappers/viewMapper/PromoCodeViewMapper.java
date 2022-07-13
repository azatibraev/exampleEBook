package com.example.demo.mappers.viewMapper;

import com.example.demo.dto.PromoCodeResponce;
import com.example.demo.models.PromoCode;

public class PromoCodeViewMapper {

    public PromoCodeResponce createView(PromoCode promoCode) {

        PromoCodeResponce responce = new PromoCodeResponce();

        responce.setId(promoCode.getId());
        responce.setName(promoCode.getName());
        responce.setDiscount(promoCode.getDiscount());
        responce.setDateOfStart(promoCode.getDateOfStart());
        responce.setDateOfFinish(promoCode.getDateOfFinish());
        return responce;
    }
}
