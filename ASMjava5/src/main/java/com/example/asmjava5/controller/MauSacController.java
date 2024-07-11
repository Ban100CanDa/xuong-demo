package com.example.asmjava5.controller;

import com.example.asmjava5.entity.MauSac;
import com.example.asmjava5.service.mauSacService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/mau-sac")
public class MauSacController {
    @Autowired
    mauSacService mauSacService;
    @GetMapping("/form")
    public String form(
                       MauSac ms,
                       Model model) {
        model.addAttribute("ms", ms);
        model.addAttribute("list", mauSacService.findAll());
        return "MauSac/index";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        mauSacService.deleteById(id);
        return "redirect:/mau-sac/form";
    }
    @PostMapping("/add")
    public String add(@Valid @ModelAttribute("sp")MauSac ms, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("ms",ms);
            model.addAttribute("list",mauSacService.findAll());
            return "MauSac/index";
        }
        mauSacService.save(ms);
        return "redirect:/mau-sac/form";
    }
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id,Model model){
        model.addAttribute("mauSac",mauSacService.findById(id).get());
        return "MauSac/detail";
    }
    @GetMapping("/update/{id}")
    public String updateform(@PathVariable("id") Integer id, Model model){
        model.addAttribute("fms",mauSacService.findById(id).get());
        return "MauSac/edit";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("fms") MauSac fms,BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()){
            model.addAttribute("fms",fms);
            model.addAttribute("list",mauSacService.findAll());
            return "MauSac/edit";
        }
        mauSacService.save(fms);
        return "redirect:/mau-sac/form";
    }
    @ModelAttribute("tt")
    public Map<Boolean, String> trangThai(){
        Map<Boolean, String> map = new HashMap<>();
        map.put(true,"Active");
        map.put(false,"Inactive");
        return map;
    }
}
