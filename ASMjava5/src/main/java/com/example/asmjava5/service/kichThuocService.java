package com.example.asmjava5.service;

import com.example.asmjava5.entity.KichThuoc;

import java.util.Optional;

public interface kichThuocService {
    <S extends KichThuoc> S save(S entity);

    <S extends KichThuoc> Iterable<S> saveAll(Iterable<S> entities);

    Optional<KichThuoc> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<KichThuoc> findAll();

    Iterable<KichThuoc> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(KichThuoc entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends KichThuoc> entities);

    void deleteAll();
}
