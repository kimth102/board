package com.th.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.board.mapper.BoardMapper;
import com.th.board.vo.Board;

@Service
public class BoardService {

	@Autowired
	BoardMapper boardMapper;
	
	/**
	 * 게시글 목록 조회
	 * 
	 * @return List<Board>
	 */
	public List<Board> selectBoardList() {
		return boardMapper.selectBoardList();
	}
	
	/**
	 * 게시글 조회
	 * 
	 * @return Board
	 */
	public Board selectBoard(int id) {
		return boardMapper.selectBoard(id);
	}
	
	/**
	 * 게시글 등록
	 * 
	 * @return int
	 */
	public int insertBoard(Board board) {
		return boardMapper.insertBoard(board);
	}
	
	/**
	 * 게시글 저장
	 * 
	 * @return int
	 */
	public int updateBoard(Board board) {
		return boardMapper.updateBoard(board);
	}
	
	/**
	 * 게시글 삭제
	 * 
	 * @return int
	 */
	public int deleteBoard(int id) {
		return boardMapper.deleteBoard(id);
	}

}
