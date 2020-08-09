package com.sandona.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Wellcome {
	@Autowired
	public Student st;
	
	
	
	//@RequestMapping("/welcome")
	@GetMapping("/welcome")
	public List<Student> showwellcom() {
		return  Arrays.asList(
				new Student("soro",22,"MSUM"),
				new Student("sandona",22,"NDSU")
		);
	}

}
