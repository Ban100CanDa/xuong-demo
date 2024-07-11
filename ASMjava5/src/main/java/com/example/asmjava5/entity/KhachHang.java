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
@Table(name = "khach_hang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ten")
    @NotBlank(message="Vui long nhap ten")
    private String ten;
    @Column(name = "sdt")
    @NotBlank(message="Vui long nhap sdt")
    private String sdt;
    @Column(name = "ma_KH")
    @NotBlank(message="Vui long nhap ma khach hang")
    private String maKh;
    @Column(name = "trang_thai")
    @NotNull(message="Vui long chon trang thai")
    private Boolean trangThai;
}
