package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bai5")
public class bai5 {
 @RequestMapping("/form")
 public String formbai5() {
		return "/poly/bai5";
	}
 @RequestMapping("/MathHCN")
 public String tinhToanChuNhat(@RequestParam double chieuDai, @RequestParam double chieuRong, Model model) {
	    double chuVi = (chieuDai + chieuRong) * 2;
	    double dienTich = chieuDai * chieuRong;
	    model.addAttribute("chieuDai", chieuDai);
	    model.addAttribute("chieuRong", chieuRong);
	    model.addAttribute("chuVi", chuVi);
	    model.addAttribute("dienTich", dienTich);
	    return "/poly/bai5";
	    }
}
