package site.metacoding.basicController.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import site.metacoding.basicController.domain.Four;
import site.metacoding.basicController.web.dto.RespDto;

@RestController
public class FourController { // Object 받기
	
	// 1. Object 자체를 타입으로 받고 return
	@GetMapping("/four")
	public Four getData() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return four;		
		// DS가 Four Object를 return받고, 해당 Object를 MessageConverter 에게 전달.
		// 통신할 때 별로 안 좋은 방법이라 사용되지 않음.
	}
	
	// 2. HttpStatus 포함해서 return (표준)
	@GetMapping("/four/data")
	public ResponseEntity<?> getData2() { // 와일드카드<? extends Object>
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		ResponseEntity<Four> response = new ResponseEntity<>(four, HttpStatus.CREATED);
		return response;
	}

	
	// 3. 직접 상태를 포함시켜 return : RespDto 를 직접 생성하고 하나하나 내가 설정하면 됨.
	@GetMapping("/four/dto")
	public RespDto<Four> getData3() {
		Four four = new Four();
		four.setTitle("제목");
		four.setContent("내용");
		return new RespDto<>(1, "성공", four);
	}
}
