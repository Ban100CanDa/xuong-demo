package com.example.asmjava5.controller;

import com.example.asmjava5.entity.SanPham;
import com.example.asmjava5.service.sanPhamService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/san-pham")
public class SanPhamController {
    @Autowired
    sanPhamService sanPhamService;

    @GetMapping("/form")
    public String form(
                       SanPham sp,
                       Model model) {
        model.addAttribute("sp", sp);
        model.addAttribute("list", sanPhamService.findAll());
        return "SanPham/index";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        sanPhamService.deleteById(id);
        return "redirect:/san-pham/form";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("sp")SanPham sp, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("sp",sp);
            model.addAttribute("list",sanPhamService.findAll());
            return "SanPham/index";
        }
        sanPhamService.save(sp);
        return "redirect:/san-pham/form";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id,Model model){
        model.addAttribute("sanPham",sanPhamService.findById(id).get());
        return "SanPham/detail";
    }
    @GetMapping("/update/{id}")
    public String updateform(@PathVariable("id") Integer id, Model model){
        model.addAttribute("fsp",sanPhamService.findById(id).get());
        return "SanPham/edit";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("fsp") SanPham fsp,BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("fsp",fsp);
            model.addAttribute("list",sanPhamService.findAll());
            return "SanPham/edit";
        }
        sanPhamService.save(fsp);
        return "redirect:/san-pham/form";
    }
    @ModelAttribute("tt")
    public Map<Boolean, String> trangThai(){
        Map<Boolean, String> map = new HashMap<>();
        map.put(true,"Con hang");
        map.put(false,"Het hang");
        return map;
    }
}
