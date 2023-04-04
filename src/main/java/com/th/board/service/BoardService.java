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
	 * 보드 목록 조회
	 * 
	 * @return List<Board>
	 */
	public List<Board> getBoardList() {
		return boardMapper.getBoardList();
	}

}
