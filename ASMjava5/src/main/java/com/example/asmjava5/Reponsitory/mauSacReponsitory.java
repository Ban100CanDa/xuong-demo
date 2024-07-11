package com.example.asmjava5.Reponsitory;

import com.example.asmjava5.entity.MauSac;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface mauSacReponsitory extends CrudRepository<MauSac, Integer> {

}
