package com.estreller.wbprj.vo;

import java.util.Date;

public class Category {
	private String code;
	private String num;
	private Date regDate;
	private String WriterNickName;
	private String RatingCode;
	private String CategoryCode;
	private String title;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getWriterNickName() {
		return WriterNickName;
	}
	public void setWriterNickName(String writerNickName) {
		WriterNickName = writerNickName;
	}
	public String getRatingCode() {
		return RatingCode;
	}
	public void setRatingCode(String ratingCode) {
		RatingCode = ratingCode;
	}
	public String getCategoryCode() {
		return CategoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		CategoryCode = categoryCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
