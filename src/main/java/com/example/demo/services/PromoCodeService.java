package com.example.demo.services;

import com.example.demo.dto.PromoCodeRequest;
import com.example.demo.dto.PromoCodeResponce;
import com.example.demo.models.PromoCode;

import com.example.demo.mappers.editMapper.PromoCodeEditMapper;
import com.example.demo.mappers.viewMapper.PromoCodeViewMapper;
import com.example.demo.repositories.PromoCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PromoCodeService {

    private final PromoCodeRepository repository;
    private final PromoCodeEditMapper editMapper;
    private final PromoCodeViewMapper viewMapper;

    public PromoCodeResponce create(PromoCodeRequest request) {
        PromoCode promoCode = editMapper.create(request);
        return viewMapper.createView(repository.save(promoCode));
    }


}
