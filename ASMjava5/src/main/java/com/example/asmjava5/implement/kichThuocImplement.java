package com.example.asmjava5.implement;

import com.example.asmjava5.Reponsitory.kichThuocReponsitory;
import com.example.asmjava5.entity.KichThuoc;
import com.example.asmjava5.service.kichThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class kichThuocImplement implements kichThuocService {
    @Autowired
    kichThuocReponsitory kichThuocReponsitory;

    @Override
    public <S extends KichThuoc> S save(S entity) {
        return kichThuocReponsitory.save(entity);
    }

    @Override
    public <S extends KichThuoc> Iterable<S> saveAll(Iterable<S> entities) {
        return kichThuocReponsitory.saveAll(entities);
    }

    @Override
    public Optional<KichThuoc> findById(Integer integer) {
        return kichThuocReponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return kichThuocReponsitory.existsById(integer);
    }

    @Override
    public Iterable<KichThuoc> findAll() {
        return kichThuocReponsitory.findAll();
    }

    @Override
    public Iterable<KichThuoc> findAllById(Iterable<Integer> integers) {
        return kichThuocReponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return kichThuocReponsitory.count();
    }

    @Override
    public void deleteById(Integer integer) {
        kichThuocReponsitory.deleteById(integer);
    }

    @Override
    public void delete(KichThuoc entity) {
        kichThuocReponsitory.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        kichThuocReponsitory.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends KichThuoc> entities) {
        kichThuocReponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        kichThuocReponsitory.deleteAll();
    }
}
