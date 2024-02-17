package idv.huichieh.user.model.vo;

import java.time.LocalDateTime;

import idv.huichieh.user.model.entity.User;
import lombok.Data;

public class UserVO {

	private Integer userID;
	private String phoneNum;
	private String userName;
	private LocalDateTime regisTime;
	private LocalDateTime lastLoginTime;
	
	public UserVO() {
		super();
	}
	
	public UserVO(User user) {
		this.userID = user.getUserID();
		this.phoneNum = user.getPhoneNum();
		this.userName = user.getUserName();
		this.regisTime = user.getRegisTime();
		this.lastLoginTime = user.getLastLoginTime();
	}

	public Integer getUserID() {
		return userID;
	}

	public void setUserID(Integer userID) {
		this.userID = userID;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public LocalDateTime getRegisTime() {
		return regisTime;
	}

	public void setRegisTime(LocalDateTime regisTime) {
		this.regisTime = regisTime;
	}

	public LocalDateTime getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(LocalDateTime lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	
	
}
