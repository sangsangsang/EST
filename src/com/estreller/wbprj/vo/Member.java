package com.estreller.wbprj.vo;

import java.util.Date;

public class Member {
	private String email;
	private String nickname;
	private	String pwd;
	private Date joinDate;
	private String totalRatings;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getTotalRatings() {
		return totalRatings;
	}
	public void setTotalRatings(String totalRatings) {
		this.totalRatings = totalRatings;
	}
	
	

}
