package com.th.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.th.board.vo.Board;

@Mapper
public interface BoardMapper {

	/**
	 * 게시글 목록 조회
	 * 
	 * @return List<Board>
	 */
	public List<Board> selectBoardList();
	
	/**
	 * 게시글 조회
	 * 
	 * @return Board
	 */
	public Board selectBoard(int id);
	
	/**
	 * 게시글 등록
	 * 
	 * @return int
	 */
	public int insertBoard(Board board);
	
	/**
	 * 게시글 저장
	 * 
	 * @return int
	 */
	public int updateBoard(Board board);
	
	/**
	 * 게시글 삭제
	 * 
	 * @return int
	 */
	public int deleteBoard(int id);

}
