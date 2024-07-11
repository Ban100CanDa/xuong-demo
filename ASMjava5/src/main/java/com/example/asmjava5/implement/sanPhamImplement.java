package com.example.asmjava5.implement;

import com.example.asmjava5.Reponsitory.sanPhamReponsitory;
import com.example.asmjava5.entity.SanPham;
import com.example.asmjava5.service.sanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class sanPhamImplement implements sanPhamService {
    @Autowired
    sanPhamReponsitory sanPhamReponsitory;

    @Override
    public <S extends SanPham> S save(S entity) {
        return sanPhamReponsitory.save(entity);
    }

    @Override
    public <S extends SanPham> Iterable<S> saveAll(Iterable<S> entities) {
        return sanPhamReponsitory.saveAll(entities);
    }

    @Override
    public Optional<SanPham> findById(Integer integer) {
        return sanPhamReponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return sanPhamReponsitory.existsById(integer);
    }

    @Override
    public Iterable<SanPham> findAll() {
        return sanPhamReponsitory.findAll();
    }

    @Override
    public Iterable<SanPham> findAllById(Iterable<Integer> integers) {
        return sanPhamReponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return sanPhamReponsitory.count();
    }

    @Override
    public void deleteById(Integer integer) {
        sanPhamReponsitory.deleteById(integer);
    }

    @Override
    public void delete(SanPham entity) {
        sanPhamReponsitory.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        sanPhamReponsitory.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends SanPham> entities) {
        sanPhamReponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        sanPhamReponsitory.deleteAll();
    }
}
