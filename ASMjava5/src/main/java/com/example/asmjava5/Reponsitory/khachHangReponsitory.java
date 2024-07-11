package com.example.asmjava5.Reponsitory;

import com.example.asmjava5.entity.KhachHang;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface khachHangReponsitory extends CrudRepository<KhachHang, Integer> {
}
