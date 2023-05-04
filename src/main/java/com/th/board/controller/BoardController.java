package com.th.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.th.board.service.BoardService;
import com.th.board.vo.Board;

@Controller
public class BoardController {

	@Autowired
	BoardService boardService;
	
	/**
	 * 게시글 목록 조회
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String list(Model model) {
		List<Board> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		
		return "board/list";
	}
	
	/**
	 * 게시글 조회
	 */
	@RequestMapping("/{id}")
	public String view(Model model, @PathVariable("id") int id) {
		Board board = boardService.selectBoard(id);
		model.addAttribute("board", board);
		
		return "board/view";
	}
	
	/**
	 * 게시글 작성
	 */
	@RequestMapping("/write")
	public String write(Model model) {
		return "board/write";
	}
	
	/**
	 * 게시글 등록
	 */
	@RequestMapping("/insert")
	public String insert(Board board) {
		boardService.insertBoard(board);
		
		return "redirect:/" + board.getId();
	}
	
	/**
	 * 게시글 수정
	 */
	@RequestMapping("/modify/{id}")
	public String modify(Model model, @PathVariable("id") int id) {
		Board board = boardService.selectBoard(id);
		model.addAttribute("board", board);
		
		return "board/modify";
	}
	
	/**
	 * 게시글 저장
	 */
	@RequestMapping("/update")
	public String update(Board board) {
		boardService.updateBoard(board);
		
		return "redirect:/" + board.getId();
	}
	
	/**
	 * 게시글 삭제
	 */
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		boardService.deleteBoard(id);
		
		return "redirect:/";
	}

}
