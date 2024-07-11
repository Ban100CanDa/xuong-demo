package com.example.asmjava5.controller;

import com.example.asmjava5.entity.NhanVien;
import com.example.asmjava5.service.nhanVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/nhan-vien")
public class NhanVienController {
    @Autowired
    nhanVienService nhanVienService;
    @GetMapping("/form")
    public String form(
                       NhanVien nv,
                       Model model) {
        model.addAttribute("nv", nv);
        model.addAttribute("list", nhanVienService.findAll());
        return "NhanVien/index";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("nv") NhanVien nv, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("nv",nv);
            model.addAttribute("list",nhanVienService.findAll());
            return "NhanVien/index";
        }
        nhanVienService.save(nv);
        return "redirect:/nhan-vien/form";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id) {
        nhanVienService.deleteById(id);
        return "redirect:/nhan-vien/form";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model){
        model.addAttribute("nhanVien",nhanVienService.findById(id).get());
        return "NhanVien/detail";
    }
    @GetMapping("/update/{id}")
    public String updateform(@PathVariable("id") Integer id, Model model){
        model.addAttribute("fnv",nhanVienService.findById(id).get());
        return "NhanVien/edit";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("fnv")NhanVien fnv, BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("fnv",fnv);
            model.addAttribute("list",nhanVienService.findAll());
            return "NhanVien/edit";
        }
        nhanVienService.save(fnv);
        return "redirect:/nhan-vien/form";
    }
    @ModelAttribute("tt")
    public Map<Boolean,String> getTrangThai(){
        Map<Boolean,String> map = new HashMap<>();
        map.put(true,"Active");
        map.put(false,"Inactice");
        return map;
    }
}
