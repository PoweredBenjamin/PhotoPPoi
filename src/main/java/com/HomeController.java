package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() { //Model model) {
		//model.addAttribute("message","Hello World");
		
		//List<Person> result = personMapper.selectAll();
		return "home";
	}

	
}
