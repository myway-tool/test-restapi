package kr.co.test.mytools.external;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//@Getter
//@Setter
@Data
@AllArgsConstructor
@Builder
public class ResponseMessage {
	private String message;
}
