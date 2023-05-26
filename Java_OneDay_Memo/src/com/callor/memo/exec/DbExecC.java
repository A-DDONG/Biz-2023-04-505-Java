package com.callor.memo.exec;

import org.apache.ibatis.session.SqlSession;

import com.callor.memo.config.DBConnection;
import com.callor.memo.mapper.MemoDao;
import com.callor.memo.models.MemoDto;

public class DbExecC {

	public static void main(String[] args) {
		
		SqlSession sqlSession = DBConnection.getFactory().openSession(true);
		MemoDao memoDao = sqlSession.getMapper(MemoDao.class);
		MemoDto memoDto = new MemoDto();
	}
}
