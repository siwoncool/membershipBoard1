package com.icia.membershipboot.controller;



import com.icia.membershipboot.dto.COMMENT;
import com.icia.membershipboot.service.CService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CController {

	private final CService csvc;
	
	@RequestMapping(value="/cList")
	public @ResponseBody List<COMMENT> cList(@ModelAttribute COMMENT comment){
		System.out.println("comment : " + comment);
		List<COMMENT> clist = csvc.cList(comment);
		System.out.println("clist : " + clist);
		return clist;
	}
	
	// cmtWrite : 댓글 작성
	@RequestMapping(value="/cmtWrite", method = RequestMethod.POST)
	public @ResponseBody List<COMMENT> cmtWrite(@ModelAttribute COMMENT comment){
		List<COMMENT> clist = csvc.cmtWrite(comment);
		return clist;
	}
	
	// cmtDelete : 댓글삭제
		@RequestMapping(value="/cmtDelete", method = RequestMethod.POST)
		public @ResponseBody List<COMMENT> cmtDelete(@ModelAttribute COMMENT comment){
			List<COMMENT> clist = csvc.cmtDelete(comment);
			return clist;
		}
	// cmtUpdate : 댓글 수정
		@RequestMapping(value="/cmtModify", method = RequestMethod.POST)
		public @ResponseBody List<COMMENT> cmtModify(@ModelAttribute COMMENT comment){
			List<COMMENT> clist = csvc.cmtModify(comment);
			return clist;
		}

}





