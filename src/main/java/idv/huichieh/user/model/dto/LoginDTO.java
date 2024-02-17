package idv.huichieh.user.model.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;


public class LoginDTO implements Serializable {

	@NotEmpty(message = "The phoneNum is not empty")
    @NotBlank(message = "The phoneNum is not blank")
    private String phoneNum;

    @NotEmpty(message = "The password is not empty")
    @NotBlank(message = "The password is not blank")
    private String password;

	public LoginDTO() {
		super();
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
