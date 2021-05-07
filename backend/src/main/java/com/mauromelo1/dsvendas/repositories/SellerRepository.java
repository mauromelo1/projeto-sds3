package com.mauromelo1.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauromelo1.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
