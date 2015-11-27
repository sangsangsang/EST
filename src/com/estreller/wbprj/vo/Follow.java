package com.estreller.wbprj.vo;

import java.sql.Date;

public class Follow {
	private String myEmail;
	private String yourEmail;
	private String num;
	private String WriterNickName;
	private Date regdate;
	private String title;
	private String categoryCode;
	public String getMyEmail() {
		return myEmail;
	}
	public void setMyEmail(String myEmail) {
		this.myEmail = myEmail;
	}
	public String getYourEmail() {
		return yourEmail;
	}
	public void setYourEmail(String yourEmail) {
		this.yourEmail = yourEmail;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getWriterNickName() {
		return WriterNickName;
	}
	public void setWriterNickName(String writerNickName) {
		WriterNickName = writerNickName;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	

}