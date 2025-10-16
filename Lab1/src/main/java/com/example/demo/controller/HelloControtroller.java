package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
public class HelloControtroller {
 @RequestMapping("/poly/hello")
 public String MyHello(Model model) {
	 return "poly/hello";
 }
}
