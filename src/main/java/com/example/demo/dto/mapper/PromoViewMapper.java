package com.example.demo.dto.mapper;

import com.example.demo.dto.PromoCodeResponce;
import com.example.demo.models.PromoCode;

public class PromoViewMapper {

    public PromoCodeResponce create(PromoCode code) {
        PromoCodeResponce responce = new PromoCodeResponce();
        responce.setId(code.getId());
        responce.setName(code.getName());
        responce.setDiscount(code.getDiscount());
        responce.setDateOfStart(code.getDateOfStart());
        responce.setDateOfFinish(code.getDateOfFinish());
        return responce;
    }
}
