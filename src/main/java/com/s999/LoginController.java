package com.s999;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		return "index";
	}

	@RequestMapping("/tables")
	public String tables(Map<String, Object> model) {
		return "tables";
	}

}
