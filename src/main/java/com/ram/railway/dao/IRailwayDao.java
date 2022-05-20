package com.ram.railway.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ram.railway.entity.Railway;

@Repository
public interface IRailwayDao extends JpaRepository<Railway, Integer> {

}
