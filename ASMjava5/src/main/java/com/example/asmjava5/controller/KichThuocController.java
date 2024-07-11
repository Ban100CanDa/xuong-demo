package com.example.asmjava5.controller;

import com.example.asmjava5.entity.KichThuoc;
import com.example.asmjava5.service.kichThuocService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/kich-thuoc")
public class KichThuocController {
    @Autowired
    kichThuocService kichThuocService;
    @GetMapping("/form")
    public String form(
                       KichThuoc kt,
                       Model model) {
        model.addAttribute("kt", kt);
        model.addAttribute("list", kichThuocService.findAll());
        return "KichThuoc/index";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        kichThuocService.deleteById(id);
        return "redirect:/kich-thuoc/form";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("sp")KichThuoc kt, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("kt",kt);
            model.addAttribute("list",kichThuocService.findAll());
            return "KichThuoc/index";
        }
        kichThuocService.save(kt);
        return "redirect:/kich-thuoc/form";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id,Model model){
        model.addAttribute("kichThuoc",kichThuocService.findById(id).get());
        return "KichThuoc/detail";
    }
    @GetMapping("/update/{id}")
    public String updateform(@PathVariable("id") Integer id, Model model){
        model.addAttribute("fkt",kichThuocService.findById(id).get());
        return "KichThuoc/edit";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("fkt") KichThuoc fkt,BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("fkt",fkt);
            model.addAttribute("list",kichThuocService.findAll());
            return "KichThuoc/edit";
        }
        kichThuocService.save(fkt);
        return "redirect:/kich-thuoc/form";
    }
    @ModelAttribute("tt")
    public Map<Boolean, String> trangThai(){
        Map<Boolean, String> map = new HashMap<>();
        map.put(true,"Con size");
        map.put(false,"Het size");
        return map;
    }
}
