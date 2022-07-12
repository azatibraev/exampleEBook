package com.example.demo.dto.mapper;


import com.example.demo.dto.PromoCodeRequest;
import com.example.demo.models.PromoCode;

public class PromoEditMapper {

    public PromoCode create(PromoCodeRequest request) {
        PromoCode promoCode = new PromoCode();

        promoCode.setName(request.getName());
        promoCode.setDiscount(request.getDiscount());
        promoCode.setDateOfStart(request.getDateOfStart());
        promoCode.setDateOfFinish(request.getDateOfFinish());
        return promoCode;
    }
}
