package com.estreller.wbprj.vo;

import java.util.Date;

public class Review {
	private String title;
	private String num;
	private Date regdate;
	private String keyword;
	private String writer;
	private String content;
	private String ratingcode;
	private String categorycode;
	private int RcmCount;
	private int ComCount;
	   
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRatingcode() {
		return ratingcode;
	}
	public void setRatingcode(String ratingcode) {
		this.ratingcode = ratingcode;
	}
	public String getCategorycode() {
		return categorycode;
	}
	public void setCategorycode(String categorycode) {
		this.categorycode = categorycode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRcmCount() {
		return RcmCount;
	}
	public void setRcmCount(int rcmCount) {
		RcmCount = rcmCount;
	}
	public int getComCount() {
		return ComCount;
	}
	public void setComCount(int comCount) {
		ComCount = comCount;
	}
	
	

}
