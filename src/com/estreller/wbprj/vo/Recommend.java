package com.estreller.wbprj.vo;

public class Recommend {
	private String Code;
	private String Writer;
	private String ReviewNum;
	private String Num;
	private String writerNickname;
	private int RcmCount;
	private int ComCount;
	
	

	
	public String getWriterNickname() {
		return writerNickname;
	}
	public void setWriterNickname(String writerNickname) {
		this.writerNickname = writerNickname;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getWriter() {
		return Writer;
	}
	public void setWriter(String writer) {
		Writer = writer;
	}
	
	public String getReviewNum() {
		return ReviewNum;
	}
	public void setReviewNum(String reviewNum) {
		ReviewNum = reviewNum;
	}
	public String getNum() {
		return Num;
	}
	public void setNum(String reviewNum) {
		Num = reviewNum;
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
