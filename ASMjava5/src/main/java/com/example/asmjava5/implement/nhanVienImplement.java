package com.example.asmjava5.implement;

import com.example.asmjava5.Reponsitory.nhanVienReponsitory;
import com.example.asmjava5.entity.NhanVien;
import com.example.asmjava5.service.nhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class nhanVienImplement implements nhanVienService {
    @Override
    public <S extends NhanVien> S save(S entity) {
        return reponsitory.save(entity);
    }

    @Override
    public <S extends NhanVien> Iterable<S> saveAll(Iterable<S> entities) {
        return reponsitory.saveAll(entities);
    }

    @Override
    public Optional<NhanVien> findById(Integer integer) {
        return reponsitory.findById(integer);
    }

    @Override
    public boolean existsById(Integer integer) {
        return reponsitory.existsById(integer);
    }

    @Override
    public Iterable<NhanVien> findAll() {
        return reponsitory.findAll();
    }

    @Override
    public Iterable<NhanVien> findAllById(Iterable<Integer> integers) {
        return reponsitory.findAllById(integers);
    }

    @Override
    public long count() {
        return reponsitory.count();
    }

    @Override
    public void deleteById(Integer integer) {
        reponsitory.deleteById(integer);
    }

    @Override
    public void delete(NhanVien entity) {
        reponsitory.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {
        reponsitory.deleteAllById(integers);
    }

    @Override
    public void deleteAll(Iterable<? extends NhanVien> entities) {
        reponsitory.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        reponsitory.deleteAll();
    }

    @Autowired
    nhanVienReponsitory reponsitory;

}
