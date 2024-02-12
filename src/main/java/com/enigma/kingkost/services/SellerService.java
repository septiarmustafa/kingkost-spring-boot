package com.enigma.kingkost.services;

import com.enigma.kingkost.dto.request.SellerRequest;
import com.enigma.kingkost.dto.response.SellerResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SellerService {
    SellerResponse createSeller(SellerRequest sellerRequest);

    SellerResponse updateSeller(SellerRequest sellerRequest);

    void deleteSeller(String id);

    List<SellerResponse> getAll();

    SellerResponse getById(String id);
}