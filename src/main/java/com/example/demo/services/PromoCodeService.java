package com.example.demo.services;

import com.example.demo.dto.PromoCodeRequest;
import com.example.demo.dto.PromoCodeResponce;
import com.example.demo.dto.mapper.PromoEditMapper;
import com.example.demo.dto.mapper.PromoViewMapper;
import com.example.demo.models.PromoCode;
import com.example.demo.repositories.PromoCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PromoCodeService {

    private final PromoCodeRepository repository;
    private final PromoEditMapper editMapper;
    private final PromoViewMapper viewMapper;

    public PromoCodeResponce create(PromoCodeRequest request) {
        PromoCode promoCode = editMapper.create(request);
        return viewMapper.create(repository.save(promoCode));
    }


}
