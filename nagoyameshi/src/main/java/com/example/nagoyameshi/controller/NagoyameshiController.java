package com.example.nagoyameshi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NagoyameshiController {
	  @GetMapping("/")
	     public String index() {
	         return "index";
	     }   
}
