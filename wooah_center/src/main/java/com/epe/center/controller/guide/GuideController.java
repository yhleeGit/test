package com.epe.center.controller.guide;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuideController {

	@GetMapping("hello")
	public String hello(Model model) {
		model.addAttribute("data", "hello");
		return "hello";
	}
}
