package com.squapl.sa.web.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.squapl.sa.domain.Article;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/addcategory")
	public String addcategory(Map<String, Object> model) {
		model.put("message", this.message);
		return "addcategory";
	}
	
	@RequestMapping("/addarticle")
	public String addarticle(Map<String, Object> model) {
		model.put("message", this.message);
		return "blogsubmit";
	}
		
	
	@RequestMapping("/blogsubmit")
	public String articlesubmit(Model model) {
		model.addAttribute("article", new Article());
		return "articlesubmit" ;
		 
	}
}