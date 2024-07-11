package com.example.asmjava5.service;

import com.example.asmjava5.entity.KhachHang;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface khachHangService {

    <S extends KhachHang> S save(S entity);

    <S extends KhachHang> Iterable<S> saveAll(Iterable<S> entities);

    Optional<KhachHang> findById(Integer integer);

    boolean existsById(Integer integer);

    Iterable<KhachHang> findAll();

    Iterable<KhachHang> findAllById(Iterable<Integer> integers);

    long count();

    void deleteById(Integer integer);

    void delete(KhachHang entity);

    void deleteAllById(Iterable<? extends Integer> integers);

    void deleteAll(Iterable<? extends KhachHang> entities);

    void deleteAll();
}
