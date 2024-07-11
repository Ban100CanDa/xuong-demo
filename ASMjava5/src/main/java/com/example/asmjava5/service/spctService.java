package com.example.asmjava5.service;

import com.example.asmjava5.entity.SPChiTiet;

import java.util.Optional;

public interface spctService {
    <S extends SPChiTiet> S save(S entity);

    <S extends SPChiTiet> Iterable<S> saveAll(Iterable<S> entities);

    Optional<SPChiTiet> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<SPChiTiet> findAll();

    Iterable<SPChiTiet> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(SPChiTiet entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends SPChiTiet> entities);

    void deleteAll();
}
