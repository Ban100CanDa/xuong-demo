package com.example.asmjava5.service;

import com.example.asmjava5.entity.HoaDonCT;

import java.util.Optional;

public interface hdctService {
    <S extends HoaDonCT> S save(S entity);

    <S extends HoaDonCT> Iterable<S> saveAll(Iterable<S> entities);

    Optional<HoaDonCT> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<HoaDonCT> findAll();

    Iterable<HoaDonCT> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(HoaDonCT entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends HoaDonCT> entities);

    void deleteAll();
}
