package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/login")
public class login {
	@Autowired
    HttpServletRequest request;
	@RequestMapping("/form")
	public String loginform() {
		return "/poly/login";
	}
	@RequestMapping("/check")
    public String loginCheck(Model model) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("poly".equals(username) && "123".equals(password)) {
            model.addAttribute("message", "Đăng nhập thành công!");

        } else {
            model.addAttribute("message", "Đăng nhập that bai");
        }
        return "/poly/login";
    }
}
	