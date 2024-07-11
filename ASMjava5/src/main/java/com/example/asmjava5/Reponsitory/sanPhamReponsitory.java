package com.example.asmjava5.Reponsitory;

import com.example.asmjava5.entity.SanPham;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sanPhamReponsitory extends CrudRepository<SanPham,Integer> {
}
