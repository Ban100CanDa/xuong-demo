package com.example.asmjava5.controller;

import com.example.asmjava5.entity.KhachHang;
import com.example.asmjava5.service.khachHangService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/khach-hang")
public class KhachHangController {
    @Autowired
    khachHangService khachHangService;
    @GetMapping("/form")
    public String form(
                       KhachHang kh,
                       Model model) {
        model.addAttribute("kh", kh);
        model.addAttribute("list", khachHangService.findAll());
        return "KhachHang/index";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("kh") KhachHang kh,BindingResult bindingResult ,Model model ){
        if(bindingResult.hasErrors()){
            model.addAttribute("kh",kh);
            model.addAttribute("list",khachHangService.findAll());
            return "KhachHang/index";
        }
        khachHangService.save(kh);
        return "redirect:/khach-hang/form";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        khachHangService.deleteById(id);
        return "redirect:/khach-hang/form";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id,Model model){
        model.addAttribute("khachHang",khachHangService.findById(id).get());
        return "KhachHang/detail";
    }
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("fkh", khachHangService.findById(id).get());
        return "KhachHang/edit";
    }

    @PostMapping("/edit")
    public String update(@Valid @ModelAttribute("fkh") KhachHang fkh,BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("fkh",fkh);
            model.addAttribute("list",khachHangService.findAll());
            return "KhachHang/edit";
        }
        khachHangService.save(fkh);
        return "redirect:/khach-hang/form";
    }
    @ModelAttribute("tt")
    public Map<Boolean,String> trangThai(){
        Map<Boolean,String> map = new HashMap<>();
        map.put(true,"Active");
        map.put(false,"Inactive");
        return map;
    }
}
