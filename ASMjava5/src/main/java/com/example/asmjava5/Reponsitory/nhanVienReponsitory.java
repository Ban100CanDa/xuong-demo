package com.example.asmjava5.Reponsitory;
import com.example.asmjava5.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface nhanVienReponsitory extends JpaRepository<NhanVien, Integer> {
}
