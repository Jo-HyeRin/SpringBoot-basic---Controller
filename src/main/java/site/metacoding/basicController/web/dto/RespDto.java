package site.metacoding.basicController.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter // JSON 변환에 필요.
@AllArgsConstructor
public class RespDto<T> { // 내가 직접 정하는 응답 형태
	private Integer code; // -1 실패, 1 성공
	private String msg; // 통신 결과 메시지 
	private T body; 	
}
