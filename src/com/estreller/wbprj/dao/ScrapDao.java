package com.estreller.wbprj.dao;

import java.sql.SQLException;
import java.util.List;

import com.estreller.wbprj.vo.Scrap;

public interface ScrapDao {

		public  List<Scrap> getScraps() throws SQLException;
		public  List<Scrap> getScraps(int page) throws SQLException;
	
		public int delete(Scrap scrap) throws SQLException;
		public int insert(Scrap scrap) throws SQLException;
}