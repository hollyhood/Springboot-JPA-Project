package com.poly.project.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {
	
	//http://localhost:8080/http/get (select)
	@GetMapping("/http/get")
	public String getTest() {
		return "get 요청";
	}
	@PostMapping("/http/get")
	public String postTest() {
		return "post 요청";
	}
	@GetMapping
	public String putTest() {
		return "put 요청";
	}
	@DeleteMapping
	public String deleteTest() {
		return "delete 요청";
	}

}
