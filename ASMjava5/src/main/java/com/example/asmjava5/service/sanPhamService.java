package com.example.asmjava5.service;

import com.example.asmjava5.entity.SanPham;

import java.util.Optional;

public interface sanPhamService {
    <S extends SanPham> S save(S entity);

    <S extends SanPham> Iterable<S> saveAll(Iterable<S> entities);

    Optional<SanPham> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<SanPham> findAll();

    Iterable<SanPham> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(SanPham entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends SanPham> entities);

    void deleteAll();
}
