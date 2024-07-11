package com.example.asmjava5.service;

import com.example.asmjava5.entity.HoaDon;

import java.util.Optional;

public interface hoaDonService {
    <S extends HoaDon> S save(S entity);

    <S extends HoaDon> Iterable<S> saveAll(Iterable<S> entities);

    Optional<HoaDon> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<HoaDon> findAll();

    Iterable<HoaDon> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(HoaDon entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends HoaDon> entities);

    void deleteAll();
}
