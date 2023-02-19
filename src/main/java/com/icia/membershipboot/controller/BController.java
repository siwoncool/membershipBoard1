package com.icia.membershipboot.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.icia.membershipboot.dto.BOARD;
import com.icia.membershipboot.dto.SEARCH;
import com.icia.membershipboot.service.BService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequiredArgsConstructor
public class BController {
	private ModelAndView mav = new ModelAndView();


	private final BService bsvc;


	private final HttpSession session;
	
	
	// bWriteForm : 게시물작성 페이지
	@RequestMapping(value = "/bWriteForm", method = RequestMethod.GET)
	public ModelAndView bWriteForm(@RequestParam(value = "boardCotegery") String boardCotegery) {
		mav.addObject("boardCotegery",boardCotegery);
		
		mav.setViewName("B_Write");
		return mav;
	}
	
	// bWrite : 게시물 등록
	@RequestMapping(value = "/bWrite", method = RequestMethod.POST)
	public ModelAndView bWrite(@ModelAttribute BOARD board) throws IllegalStateException, IOException {
	
		mav = bsvc.bWrite(board);
		return mav;
	}
	// bList : 게시물목록
	@RequestMapping(value = "/bList", method = RequestMethod.GET)
	public ModelAndView bList(@RequestParam(value = "page", required = false, defaultValue = "1") int page,@RequestParam(value = "boardCotegery") String boardCotegery)
	{
		mav = bsvc.bList(page,boardCotegery);
		return mav;
	}
	// bSearch : 회원검색
	@RequestMapping(value = "/bSearch", method = RequestMethod.GET)
	public ModelAndView bSearch(@RequestParam(value = "page", required = false, defaultValue = "1") int page,@RequestParam(value = "boardCotegery") String boardCotegery
			,@RequestParam(value = "category") String category,@RequestParam(value = "keyword") String keyword)
		 {
		mav = bsvc.bSearch(page,boardCotegery,category,keyword);
		return mav;
	}
	// bView : 게시글 상세보기
	@RequestMapping(value = "/bView", method = RequestMethod.GET)
	public ModelAndView bView(@ModelAttribute BOARD board) {
		System.out.println("컨트롤러 "+board.getBoardCotegery());
		mav = bsvc.bView(board);
		return mav;
	}
	// bModiForm : 게시글수정페이지
		@RequestMapping(value = "/bModiForm", method = RequestMethod.GET)
		public ModelAndView bModiForm(@ModelAttribute BOARD board) {
			System.out.println("넘어온 boardCotegery 그리고  num 값 :"+board.getBoardCotegery()+board.getBoNum());
			mav = bsvc.bModiForm(board);
			return mav;
		}

		// bModify : 게시글수정
		@RequestMapping(value = "/bModify", method = RequestMethod.POST)
		public ModelAndView bModify(@ModelAttribute BOARD board) throws IllegalStateException, IOException {
			mav = bsvc.bModify(board);
			return mav;
		}
		// bDelete : 게시글 삭제
		@RequestMapping(value="/bDelete", method = RequestMethod.GET)
		public ModelAndView bDelete(@ModelAttribute BOARD board) {
			mav = bsvc.bDelete(board);
			
			return mav;
		}
		
		@RequestMapping(value="/boardHit")
		public @ResponseBody List<BOARD> boardHit(@ModelAttribute BOARD board){
			System.out.println("board : " + board);
			List<BOARD> boardHit = bsvc.boardHit(board);
			System.out.println("boardHit : " + boardHit);
			return boardHit;
		}
}
