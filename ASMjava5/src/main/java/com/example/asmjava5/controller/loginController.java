package com.example.asmjava5.controller;

import com.example.asmjava5.entity.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class loginController {
    @GetMapping("/form")
    public String showLoginForm() {
        return "DangNhap";
    }

    @PostMapping("/login")
    public String login(user u, Model model){
        String user = u.getUsername();
        String pass = u.getPassword();
        if(user.equals("admin") && pass.equals("1234")){
            model.addAttribute("username",user);
            model.addAttribute("password",pass);
            return  "redirect:/san-pham/form";
        }
        model.addAttribute("msg","sai thong tin");
        return "DangNhap";
    }
}
