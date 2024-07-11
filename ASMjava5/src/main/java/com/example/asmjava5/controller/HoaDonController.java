package com.example.asmjava5.controller;


import com.example.asmjava5.entity.HoaDon;
import com.example.asmjava5.entity.KhachHang;
import com.example.asmjava5.entity.KichThuoc;
import com.example.asmjava5.entity.NhanVien;
import com.example.asmjava5.service.hoaDonService;
import com.example.asmjava5.service.khachHangService;
import com.example.asmjava5.service.nhanVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/hoa-don")
public class HoaDonController {
    @Autowired
    hoaDonService hoaDonService;
    @Autowired
    nhanVienService nhanVienService;
    @Autowired
    khachHangService khachHangService;

    @GetMapping("/form")
    public String form(
                       HoaDon hd,
                       Model model) {
        model.addAttribute("hd", hd);
        model.addAttribute("list", hoaDonService.findAll());
        return "HoaDon/index";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        hoaDonService.deleteById(id);
        return "redirect:/hoa-don/form";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("hd") HoaDon hd, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("hd", hd);
            model.addAttribute("list", hoaDonService.findAll());
            return "HoaDon/index";
        }
        LocalDate currentDate = LocalDate.now();
        hd.setNgayTao(currentDate);
        hoaDonService.save(hd);
        return "redirect:/hoa-don/form";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id,Model model){
        model.addAttribute("hoaDon",hoaDonService.findById(id).get());
        return "HoaDon/detail";
    }
    @GetMapping("/update/{id}")
    public String updateform(@PathVariable("id") Integer id, Model model){
        model.addAttribute("fhd",hoaDonService.findById(id).get());
        return "HoaDon/edit";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("fhd") HoaDon fhd,BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("hd",fhd);
            model.addAttribute("list",hoaDonService.findAll());
            return "HoaDon/edit";
        }
        LocalDate currentDate = LocalDate.now();
        fhd.setNgayTao(currentDate);
        hoaDonService.save(fhd);
        return "redirect:/hoa-don/form";
    }
    @ModelAttribute("tt")
    public Map<Boolean, String> trangThai(){
        Map<Boolean, String> map = new HashMap<>();
        map.put(true,"Da thanh toan");
        map.put(false,"Chua thanh toan");
        return map;
    }
    @ModelAttribute("khachHang")
    private Iterable<KhachHang> listkh(){
        return khachHangService.findAll();
    }
    @ModelAttribute("nhanVien")
    private Iterable<NhanVien> listnv(){
        return nhanVienService.findAll();
    }
}
