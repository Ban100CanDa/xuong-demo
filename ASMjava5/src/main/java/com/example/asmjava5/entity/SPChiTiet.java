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
@Table(name = "spct")
public class SPChiTiet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ma_spct")
    @NotBlank(message = "Vui long nhap Ma SPCT")
    private String maSPCT;
    @ManyToOne
    @JoinColumn(name = "id_kich_thuoc")
    @NotNull(message = "Vui long nhap kich thuoc")
    private KichThuoc idKichThuoc;
    @ManyToOne
    @JoinColumn(name = "id_mau_sac")
    @NotNull(message = "Vui long nhap mau sac")
    private MauSac idMauSac;
    @ManyToOne
    @JoinColumn(name = "id_san_pham")
    @NotNull(message = "Vui long nhap Ten san pham")
    private SanPham idSanPham;
    @Column(name = "so_luong")
    @NotNull(message = "Vui long nhap so luong")
    private Integer soLuong;
    @Column(name = "don_gia")
    @NotNull(message = "Vui long nhap don gia")
    private Double donGia;
    @Column(name = "trang_thai")
    @NotNull(message="Vui long chon trang thai")
    private Boolean trangThai;
}
