package com.estreller.wbprj.vo;

import java.util.Date;

public class Category {
   private String code;
   private String num;
   private Date regdate;
   private String writer;
   private String WriterNickName;
   private String RatingCode;
   private String CategoryCode;
   private String title;
   private int RcmCount;
   private int ComCount;
   
   
   
   
   public String getWriter() {
      return writer;
   }
   public void setWriter(String writer) {
      this.writer = writer;
   }
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
   public Date getRegdate() {
      return regdate;
   }
   public void setRegDate(Date regdate) {
      this.regdate = regdate;
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