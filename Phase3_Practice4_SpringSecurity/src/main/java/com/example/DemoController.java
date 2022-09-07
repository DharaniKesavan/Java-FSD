package com.example;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	@ResponseBody
	@RequestMapping("/")
	public String demo() {
		return "Welcome to Demo!!!";
	}
	
	@ResponseBody
	@RequestMapping("/admin")
	public String admin() {
		return "Welcome Admin!!!";
	}

	@ResponseBody
	@RequestMapping("/user")
	public String user() {
		return "Welcome User!!!";
	}
}




