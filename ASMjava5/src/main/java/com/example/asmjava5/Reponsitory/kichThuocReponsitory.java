package com.example.asmjava5.Reponsitory;

import com.example.asmjava5.entity.KichThuoc;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface kichThuocReponsitory extends CrudRepository<KichThuoc, Integer> {
}
