package com.example.asmjava5.Reponsitory;

import com.example.asmjava5.entity.HoaDonCT;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hdctReponsitory extends CrudRepository<HoaDonCT, Integer> {
}
