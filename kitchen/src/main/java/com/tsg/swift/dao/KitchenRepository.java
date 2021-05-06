package com.tsg.swift.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsg.swift.dto.Kitchen;



public interface KitchenRepository extends JpaRepository<Kitchen,Integer> {
 Optional<Kitchen> findByOrderid(String orderid);
}