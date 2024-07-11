package com.example.asmjava5.service;

import com.example.asmjava5.entity.NhanVien;

import java.util.Optional;

public interface nhanVienService {
    <S extends NhanVien> S save(S entity);

    <S extends NhanVien> Iterable<S> saveAll(Iterable<S> entities);

    Optional<NhanVien> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<NhanVien> findAll();

    Iterable<NhanVien> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(NhanVien entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends NhanVien> entities);

    void deleteAll();
}
