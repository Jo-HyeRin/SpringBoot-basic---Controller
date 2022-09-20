package site.metacoding.basicController.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 응답형태 : data 
public class FirstController {
	// Postman 으로 간단하게 Get, Post, Put, Delete 요청을 해볼 수 있다 !
	@GetMapping("/first")
	public String getData() {
		return "<h1>get data</h1>";
	}
	
	@PostMapping("/first")
	public String postData() {
		return "<h1>insert data</h1>";
	}
	
	@PutMapping("/first")
	public String putData() {
		return "<h1>update data</h1>";
	}
	
	@DeleteMapping("/first")
	public String deleteData() {
		return "<h1>delete data</h1>";
	}
	
}
