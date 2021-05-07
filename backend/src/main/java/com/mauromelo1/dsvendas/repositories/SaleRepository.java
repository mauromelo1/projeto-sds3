package com.mauromelo1.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauromelo1.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
