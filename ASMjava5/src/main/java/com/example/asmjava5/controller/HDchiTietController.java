package com.example.asmjava5.controller;

import com.example.asmjava5.entity.*;
import com.example.asmjava5.service.hdctService;
import com.example.asmjava5.service.hoaDonService;
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
@RequestMapping("/hdct")
public class HDchiTietController {
    @Autowired
    hdctService hdctService;
    @Autowired
    hoaDonService hoaDonService;
    @Autowired
    spctService spctService;

    @GetMapping("/form")
    public String form(
                       HoaDonCT hdct,
                       Model model) {
        model.addAttribute("hdct", hdct);
        model.addAttribute("list", hdctService.findAll());
        return "HDChiTiet/index";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("hdct") HoaDonCT hdct, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("hdct",hdct);
            model.addAttribute("list",hdctService.findAll());
            return "/HDChiTiet/index";
        }
        hdctService.save(hdct);
        return "redirect:/hdct/form";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        hdctService.deleteById(id);
        return "redirect:/hdct/form";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id, Model model){
        model.addAttribute("detail",hdctService.findById(id).get());
        return "HDChiTiet/detail";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("edit",hdctService.findById(id).get());
        return "HDChiTiet/edit";
    }
    @PostMapping("/edit")
    public String edit(@Valid @ModelAttribute("edit") HoaDonCT hdct ,BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            model.addAttribute("hdct",hdct);
            model.addAttribute("list",hdctService.findAll());
            return "HDChiTiet/edit";
        }
        hdctService.save(hdct);
        return "redirect:/hdct/form";
    }
    @ModelAttribute("tt")
    public Map<Boolean, String> trangThai(){
        Map<Boolean,String> map = new HashMap<>();
        map.put(true,"Da thanh toan");
        map.put(false,"Chua thanh toan");
        return map;
    }
    @ModelAttribute("hoaDon")
    private Iterable<HoaDon> listhd(){
        return hoaDonService.findAll();
    }
    @ModelAttribute("spct")
    private Iterable<SPChiTiet> listspct(){
        return spctService.findAll();
    }
}
