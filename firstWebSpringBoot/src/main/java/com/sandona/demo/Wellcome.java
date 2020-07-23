package com.sandona.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wellcome {
	
	@RequestMapping("/welcome")
	public String showwellcom() {
		return "hi Soro";
	}

}
