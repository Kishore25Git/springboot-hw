package com.helloworld.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {


	@GetMapping("/hw")
	public String helloworld() {
		System.out.println("## KKA in HelloWorld Controller ##");
		return "Hello World !!";
	}

}
