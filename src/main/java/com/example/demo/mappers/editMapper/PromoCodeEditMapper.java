package com.example.demo.mappers.editMapper;

import com.example.demo.dto.PromoCodeRequest;
import com.example.demo.models.PromoCode;

public class PromoCodeEditMapper {

    public PromoCode create(PromoCodeRequest request) {

        PromoCode promoCode = new PromoCode();

        promoCode.setName(request.getName());
        promoCode.setDiscount(request.getDiscount());
        promoCode.setDateOfStart(request.getDateOfStart());
        promoCode.setDateOfFinish(request.getDateOfFinish());
        return promoCode;
    }
}
