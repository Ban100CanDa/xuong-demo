package com.example.asmjava5.Reponsitory;

import com.example.asmjava5.entity.SPChiTiet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface spctReponsitory extends CrudRepository<SPChiTiet, Integer> {
}
