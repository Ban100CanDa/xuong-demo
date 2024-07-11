package com.example.asmjava5.implement;

import com.example.asmjava5.Reponsitory.khachHangReponsitory;
import com.example.asmjava5.entity.KhachHang;
import com.example.asmjava5.service.khachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class khachHangImplement implements khachHangService {
    @Autowired
    khachHangReponsitory khachHangReponsitory;

    @Override
    public <S extends KhachHang> S save(S entity) {
        return khachHangReponsitory.save(entity);
    }

    @Override
    public <S extends KhachHang> Iterable<S> saveAll(Iterable<S> entities) {
        return khachHangReponsitory.saveAll(entities);
    }

    @Override
    public Optional<KhachHang> findById(Integer integer) {
        return khachHangReponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return khachHangReponsitory.existsById(integer);
    }

    @Override
    public Iterable<KhachHang> findAll() {
        return khachHangReponsitory.findAll();
    }

    @Override
    public Iterable<KhachHang> findAllById(Iterable<Integer> integers) {
        return khachHangReponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return khachHangReponsitory.count();
    }

    @Override
    public void deleteById(Integer integer) {
        khachHangReponsitory.deleteById(integer);
    }

    @Override
    public void delete(KhachHang entity) {
        khachHangReponsitory.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        khachHangReponsitory.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends KhachHang> entities) {
        khachHangReponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        khachHangReponsitory.deleteAll();
    }
}
