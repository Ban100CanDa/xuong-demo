package com.example.asmjava5.implement;

import com.example.asmjava5.Reponsitory.hdctReponsitory;
import com.example.asmjava5.entity.HoaDonCT;
import com.example.asmjava5.service.hdctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class hdctImplement implements hdctService {
    @Override
    public <S extends HoaDonCT> S save(S entity) {
        return hdctReponsitory.save(entity);
    }

    @Override
    public <S extends HoaDonCT> Iterable<S> saveAll(Iterable<S> entities) {
        return hdctReponsitory.saveAll(entities);
    }

    @Override
    public Optional<HoaDonCT> findById(Integer integer) {
        return hdctReponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return hdctReponsitory.existsById(integer);
    }

    @Override
    public Iterable<HoaDonCT> findAll() {
        return hdctReponsitory.findAll();
    }

    @Override
    public Iterable<HoaDonCT> findAllById(Iterable<Integer> integers) {
        return hdctReponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return hdctReponsitory.count();
    }

    @Override
    public void deleteById(Integer integer) {
        hdctReponsitory.deleteById(integer);
    }

    @Override
    public void delete(HoaDonCT entity) {
        hdctReponsitory.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        hdctReponsitory.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends HoaDonCT> entities) {
        hdctReponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        hdctReponsitory.deleteAll();
    }

    @Autowired
    hdctReponsitory hdctReponsitory;
}
