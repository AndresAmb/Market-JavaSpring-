package com.springjava.marketSpring.domain.repository;

import com.springjava.marketSpring.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientID);
    Purchase save(Purchase purchase);
}
