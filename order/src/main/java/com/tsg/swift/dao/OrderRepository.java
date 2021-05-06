package com.tsg.swift.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsg.swift.dto.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer> {
 Optional<Orders> findById(long id);
}