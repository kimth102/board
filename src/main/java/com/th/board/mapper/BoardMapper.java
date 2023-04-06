package com.th.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.th.board.vo.Board;

@Mapper
public interface BoardMapper {

	/**
	 * 보드 목록 조회
	 * 
	 * @return List<Board>
	 */
	public List<Board> getBoardList();

}
