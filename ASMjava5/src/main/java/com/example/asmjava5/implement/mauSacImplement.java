package com.example.asmjava5.implement;

import com.example.asmjava5.Reponsitory.mauSacReponsitory;
import com.example.asmjava5.entity.MauSac;
import com.example.asmjava5.service.mauSacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class mauSacImplement implements mauSacService {
    @Autowired
    mauSacReponsitory mauSacReponsitory;

    @Override
    public <S extends MauSac> S save(S entity) {
        return mauSacReponsitory.save(entity);
    }

    @Override
    public <S extends MauSac> Iterable<S> saveAll(Iterable<S> entities) {
        return mauSacReponsitory.saveAll(entities);
    }

    @Override
    public Optional<MauSac> findById(Integer integer) {
        return mauSacReponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return mauSacReponsitory.existsById(integer);
    }

    @Override
    public Iterable<MauSac> findAll() {
        return mauSacReponsitory.findAll();
    }

    @Override
    public Iterable<MauSac> findAllById(Iterable<Integer> integers) {
        return mauSacReponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return mauSacReponsitory.count();
    }

    @Override
    public void deleteById(Integer integer) {
        mauSacReponsitory.deleteById(integer);
    }

    @Override
    public void delete(MauSac entity) {
        mauSacReponsitory.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        mauSacReponsitory.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends MauSac> entities) {
        mauSacReponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        mauSacReponsitory.deleteAll();
    }
}
