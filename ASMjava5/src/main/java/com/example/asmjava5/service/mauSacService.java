package com.example.asmjava5.service;

import com.example.asmjava5.entity.MauSac;

import java.util.Optional;

public interface mauSacService {
    <S extends MauSac> S save(S entity);

    <S extends MauSac> Iterable<S> saveAll(Iterable<S> entities);

    Optional<MauSac> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<MauSac> findAll();

    Iterable<MauSac> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(MauSac entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends MauSac> entities);

    void deleteAll();
}
