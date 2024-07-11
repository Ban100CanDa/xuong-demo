package com.example.asmjava5.implement;

import com.example.asmjava5.Reponsitory.spctReponsitory;
import com.example.asmjava5.entity.SPChiTiet;
import com.example.asmjava5.service.spctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class spctImplement implements spctService {
    @Autowired
    spctReponsitory spctReponsitory;

    @Override
    public <S extends SPChiTiet> S save(S entity) {
        return spctReponsitory.save(entity);
    }

    @Override
    public <S extends SPChiTiet> Iterable<S> saveAll(Iterable<S> entities) {
        return spctReponsitory.saveAll(entities);
    }

    @Override
    public Optional<SPChiTiet> findById(Integer integer) {
        return spctReponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return spctReponsitory.existsById(integer);
    }

    @Override
    public Iterable<SPChiTiet> findAll() {
        return spctReponsitory.findAll();
    }

    @Override
    public Iterable<SPChiTiet> findAllById(Iterable<Integer> integers) {
        return spctReponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return spctReponsitory.count();
    }

    @Override
    public void deleteById(Integer integer) {
        spctReponsitory.deleteById(integer);
    }

    @Override
    public void delete(SPChiTiet entity) {
        spctReponsitory.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        spctReponsitory.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends SPChiTiet> entities) {
        spctReponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        spctReponsitory.deleteAll();
    }
}
