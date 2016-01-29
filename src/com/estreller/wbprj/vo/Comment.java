package com.estreller.wbprj.vo;

import java.util.Date;

public class Comment {
	private String cmtcode;
	private String code;
	private String writer;
	private String reviewNum;
	private String content;
	private String ratingCode;
	private Date Regdate;
	private String writerNickname;
	
	
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
	public String getWriterNickname() {
		return writerNickname;
	}
	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}
	

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCmtcode() {
		return cmtcode;
	}
	public void setCmtcode(String cmtcode) {
		this.cmtcode = cmtcode;
	}
	
	
	
}

