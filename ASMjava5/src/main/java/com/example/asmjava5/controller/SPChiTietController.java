package com.example.asmjava5.controller;

import com.example.asmjava5.entity.KichThuoc;
import com.example.asmjava5.entity.MauSac;
import com.example.asmjava5.entity.SPChiTiet;
import com.example.asmjava5.entity.SanPham;
import com.example.asmjava5.service.kichThuocService;
import com.example.asmjava5.service.mauSacService;
import com.example.asmjava5.service.sanPhamService;
import com.example.asmjava5.service.spctService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/spct")
public class SPChiTietController {
    @Autowired
    spctService spctService;
    @Autowired
    kichThuocService kichThuocService;
    @Autowired
    mauSacService mauSacService;
    @Autowired
    sanPhamService sanPhamService;

    @GetMapping("/form")
    public String form(
                       SPChiTiet spct,
                       Model model) {
        model.addAttribute("spct", spct);
        model.addAttribute("list", spctService.findAll());
        return "SPChiTiet/index";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("spct") SPChiTiet spct, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("spct",spct);
            model.addAttribute("list",spctService.findAll());
            return "/SPChiTiet/index";
        }
        spctService.save(spct);
        return "redirect:/spct/form";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        spctService.deleteById(id);
        return "redirect:/spct/form";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model){
        model.addAttribute("detail",spctService.findById(id).get());
        return "SPChiTiet/detail";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("edit",spctService.findById(id).get());
        return "SPChiTiet/edit";
    }
    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute("edit") SPChiTiet spct ,BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("spct",spct);
            model.addAttribute("list",spctService.findAll());
            return "SPChiTiet/edit";
        }
        spctService.save(spct);
        return "redirect:/spct/form";
    }
    @ModelAttribute("tt")
    public Map<Boolean, String> trangThai(){
        Map<Boolean,String> map = new HashMap<>();
        map.put(true,"Con hang");
        map.put(false,"Het hang");
        return map;
    }
    @ModelAttribute("kichThuoc")
    private Iterable<KichThuoc> listkt(){
        return kichThuocService.findAll();
    }
    @ModelAttribute("mauSac")
    private Iterable<MauSac> listms(){
        return mauSacService.findAll();
    }
    @ModelAttribute("sanPham")
    private Iterable<SanPham> listsp(){
        return sanPhamService.findAll();
    }
}
