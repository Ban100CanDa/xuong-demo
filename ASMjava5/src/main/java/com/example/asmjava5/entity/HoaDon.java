package com.example.asmjava5.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Date;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "hoa_don")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_nhan_vien")
    @NotNull(message = "Vui long nhap Nhan vien")
    private NhanVien idNV;
    @ManyToOne
    @JoinColumn(name = "id_khach_hang")
    @NotNull(message = "Vui long nhap Khach hang")
    private KhachHang idKH;
    @Column(name = "ngay_mua_hang")
    private LocalDate ngayTao;
    @Column(name = "trang_thai")
    @NotNull(message = "Vui long chon trang thai")
    private Boolean trangThai;
}
