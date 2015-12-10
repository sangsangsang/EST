package com.estreller.wbprj.dao;

import java.util.List;

import com.estreller.wbprj.vo.Member;
import com.estreller.wbprj.vo.ReviewFile;

public interface ReviewFileDao {
	public  List<ReviewFile> getReviewFiles(String noitceCode);
	public int insert(ReviewFile file);
}
