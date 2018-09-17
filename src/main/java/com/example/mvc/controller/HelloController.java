package com.example.mvc.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class HelloController {
	@RequestMapping("/index")
	 String indexHtml(HashMap<String, String> map) {
		map.put("name", "Dear");
	        return "/index";
	    }
	
}
