package com.example.asmjava5.implement;

import com.example.asmjava5.Reponsitory.hoaDonReponsitory;
import com.example.asmjava5.entity.HoaDon;
import com.example.asmjava5.service.hoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class hoaDonImplement implements hoaDonService {
    @Override
    public <S extends HoaDon> S save(S entity) {
        return hoaDonReponsitory.save(entity);
    }

    @Override
    public <S extends HoaDon> Iterable<S> saveAll(Iterable<S> entities) {
        return hoaDonReponsitory.saveAll(entities);
    }

    @Override
    public Optional<HoaDon> findById(Integer integer) {
        return hoaDonReponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return hoaDonReponsitory.existsById(integer);
    }

    @Override
    public Iterable<HoaDon> findAll() {
        return hoaDonReponsitory.findAll();
    }

    @Override
    public Iterable<HoaDon> findAllById(Iterable<Integer> integers) {
        return hoaDonReponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return hoaDonReponsitory.count();
    }

    @Override
    public void deleteById(Integer integer) {
        hoaDonReponsitory.deleteById(integer);
    }

    @Override
    public void delete(HoaDon entity) {
        hoaDonReponsitory.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        hoaDonReponsitory.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends HoaDon> entities) {
        hoaDonReponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        hoaDonReponsitory.deleteAll();
    }

    @Autowired
    hoaDonReponsitory hoaDonReponsitory;
}
