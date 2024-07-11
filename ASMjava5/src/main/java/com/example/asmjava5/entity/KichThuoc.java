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
@NoArgsConstructor
@AllArgsConstructor
@Component
@Entity
@Table(name = "kich_thuoc")
public class KichThuoc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ma")
    @NotBlank(message="Vui long nhap ma")
    private String ma;
    @Column(name = "ten")
    @NotBlank(message="Vui long nhap ten")
    private String ten;
    @Column(name = "trang_thai")
    @NotNull(message="Vui long chon trang thai")
    private Boolean trangThai;
}
