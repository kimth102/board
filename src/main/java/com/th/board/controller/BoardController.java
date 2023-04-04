package com.th.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.th.board.service.BoardService;
import com.th.board.vo.Board;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	/**
	 * 목록 조회
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String list(Model model) {
		List<Board> list = boardService.getBoardList();
		System.out.println(list);
		model.addAttribute("list", list);
		
		return "board/list";
	}

}
