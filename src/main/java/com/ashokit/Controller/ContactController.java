package com.ashokit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
	@GetMapping("/welcome")
	public String Welcome(Model model)
	{
		model.addAttribute("msg", "WElcome to Contact");
		return "index";
	}
	
	

}
