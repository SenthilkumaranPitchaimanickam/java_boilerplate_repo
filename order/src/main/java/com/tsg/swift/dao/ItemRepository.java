package com.tsg.swift.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsg.swift.dto.OrderItem;



public interface ItemRepository extends JpaRepository<OrderItem,Integer> {
}
