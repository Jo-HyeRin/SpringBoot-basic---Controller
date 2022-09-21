package site.metacoding.basicController.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import site.metacoding.basicController.domain.Third;

@RestController
public class ThirdController { // 고급 데이터 받기(Body data, JSON) : @RequestBody 이용하자
	
	@PostMapping("/third")
	public String postData(Third third) {
		return "id : "+third.getId()+", title : "+third.getTitle()+", content : "+third.getContent();
	}

	@PutMapping("/third/{id}")
	public String putData(@PathVariable Integer id, Third third) {
		return third.toString();
	}

	@PutMapping("/third/{id}/json")
	public String putJsonData(@PathVariable Integer id, @RequestBody Third third) { 
		return third.toString();
	}	

}
