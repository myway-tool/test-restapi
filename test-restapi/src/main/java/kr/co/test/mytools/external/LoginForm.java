package kr.co.test.mytools.external;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class LoginForm {

	@NotBlank
	private String id;

	@NotBlank
	private String pw;


//	@Length(max = 64) // 최대 길이 64
//    @NotBlank // 빈문자열은 안됨
//    private String uid;
//    @NotNull // null 안됨
//    private ContactType contactType;
//    @Length(max = 1_600) // 최대 길이 1,600
//    private String contact;
}
