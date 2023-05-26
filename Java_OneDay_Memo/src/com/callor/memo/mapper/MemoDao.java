package com.callor.memo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.callor.memo.mapper.sql.MemoSQL;
import com.callor.memo.models.MemoDto;

public interface MemoDao {
	
	@Select( " SELECT * FROM tbl_memo ")
	public List<MemoDto> selectAll();
	
	@Select(" SELECT * FROM tbl_memo WHERE m_seq = #{id} ")
	public MemoDto findById(String id);
	
	@Delete(" DELETE FROM tbl_memo WHERE m_seq = #{id} ")
	public int delete(String id);
	
	@Insert(MemoSQL.MEMO_INSERT)
	public int insert(MemoDto dto);
	
	@Update(MemoSQL.MEMO_UPDATE)
	public int update(MemoDto dto);
}
