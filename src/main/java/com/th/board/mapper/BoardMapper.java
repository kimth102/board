package com.th.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.th.board.vo.Board;

@Mapper
public interface BoardMapper {

	/**
	 * 보드 목록 조회
	 * 
	 * @return List<Board>
	 */
	@Select("SELECT id, title, contents, reg_date, mod_date " +
			"FROM board WHERE is_del = 0")
	public List<Board> getBoardList();

}
