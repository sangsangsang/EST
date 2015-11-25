package com.estreller.wbprj.vo;

import java.util.Date;

public class Comment {
	private String writer;
	private String reviewNum;
	private String content;
	private String ratingCode;
	private Date Regdate;
	private String nickName;
	
	
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getReviewNum() {
		return reviewNum;
	}
	public void setReviewNum(String reviewNum) {
		this.reviewNum = reviewNum;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRatingCode() {
		return ratingCode;
	}
	public void setRatingCode(String ratingCode) {
		this.ratingCode = ratingCode;
	}
	public Date getRegdate() {
		return Regdate;
	}
	public void setRegdate(Date regdate) {
		Regdate = regdate;
	}
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
	
}

