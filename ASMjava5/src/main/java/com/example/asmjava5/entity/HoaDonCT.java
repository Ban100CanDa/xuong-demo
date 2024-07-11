package com.example.asmjava5.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "hoa_don_chi_tiet")
public class HoaDonCT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "id_hoa_don")
    @NotNull(message = "Vui long nhap hoa don")
    private HoaDon idHoaDon;
    @ManyToOne
    @JoinColumn(name = "id_spct")
    @NotNull(message = "Vui long nhap spct")
    private SPChiTiet idSpct;
    @Column(name = "so_luong")
    @NotNull(message = "Vui long nhap so luong")
    private Integer soLuong;
    @Column(name = "don_gia")
    @NotNull(message = "Vui long nhap don gia")
    private Double donGia;
    @Column(name = "trang_thai")
    @NotNull(message = "Vui long chon trang thai")
    private Boolean trangThai;
}
