package com.tsg.swift.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsg.swift.dto.KitchenItem;



public interface ItemRepository extends JpaRepository<KitchenItem,Integer> {
}
