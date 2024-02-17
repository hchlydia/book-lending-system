package idv.huichieh.user.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userID;
	private String phoneNum;
	private String password;
	private String userName;
	@CreationTimestamp
	private LocalDateTime regisTime;
	private LocalDateTime lastLoginTime;
	
	
	public User() {
		super();
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
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


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "User [userID=" + userID + ", phoneNum=" + phoneNum + ", password=" + password + ", userName=" + userName
				+ ", regisTime=" + regisTime + ", lastLoginTime=" + lastLoginTime + "]";
	}
	
}
