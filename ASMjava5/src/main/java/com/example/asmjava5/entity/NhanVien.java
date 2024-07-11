package com.example.asmjava5.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "nhan_vien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ten")
    @NotBlank(message="Vui long nhap ten")
    private String ten;
    @Column(name = "ma_NV")
    @NotBlank(message="Vui long nhap ma nhan vien")
    private String maNv;
    @Column(name = "ten_dang_nhap")
    @NotBlank(message="Vui long nhap ten dang nhap")
    private String tenDangNhap;
    @Column(name = "mat_khau")
    @NotBlank(message="Vui long nhap mat khau")
    private String matKhau;
    @Column(name = "trang_thai")
    @NotNull(message="Vui long chon trang thai")
    private boolean trangThai;
}
