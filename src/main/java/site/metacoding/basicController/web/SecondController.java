package site.metacoding.basicController.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController { // 데이터 받기
	
	// 변수(PK)를 받는 경우
	@GetMapping("/second/{id}")
	public String getData1(@PathVariable Integer id){
		return "id : "+id;
	}
	
	// 주소에 데이터를 보낼 수 있다 - QueryString = x-www-form-urlencoded 타입 (key=value)
	@GetMapping("/second")
	public String getData2(String title, String content) {
		return "title : "+title+ ", content : "+content;
	}
	
	// Body에 데이터를 담아 보낼 수 있다 - title=제목&content=내용 
	@PostMapping("/second")
	public String postData2(String title, String content) {
		return "title : "+title+ ", content : "+content;
	}

	@PutMapping("/second")
	public String putData(String title, String content) { 
		return "title : "+title+ ", content : "+content;
	}

	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) { 
		return id+" delete ok";
	}
	
}
