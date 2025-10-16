package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/bai52")
public class bai5cach2 {
	@Autowired
    HttpServletRequest request;
	@RequestMapping("/form2")
	public String formbai5cach2() {
		return "/poly/bai5";
	}
	@RequestMapping("/MathHCNcach2")
	public String tinhToanChuNhatcach2(Model model) {
		double chieuDai = Double.parseDouble(request.getParameter("chieuDai"));
        double chieuRong = Double.parseDouble(request.getParameter("chieuRong"));
        double chuVi = (chieuDai + chieuRong) * 2;
	    double dienTich = chieuDai * chieuRong;
	    
	    model.addAttribute("chieuDai", chieuDai);
	    model.addAttribute("chieuRong", chieuRong);
	    model.addAttribute("chuVi", chuVi);
	    model.addAttribute("dienTich", dienTich);
	    return "/poly/bai5";
	}
}
