package com.icia.membershipboot.service;



import com.icia.membershipboot.dao.CDAO;
import com.icia.membershipboot.dto.COMMENT;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CService {


	private final CDAO cdao;

	public List<COMMENT> cList(COMMENT comment) {
		List<COMMENT> commentList = cdao.cList(comment.getCbNum());

		return commentList;
	}

	public List<COMMENT> cmtWrite(COMMENT comment) {

		List<COMMENT> commentList;

		int result = cdao.cmtWrite(comment);

		if (result > 0) {
			commentList = cdao.cList(comment.getCbNum());
		} else {
			commentList = null;
		}

		return commentList;
	}

	public List<COMMENT> cmtDelete(COMMENT comment) {
		List<COMMENT> commentList;

		int result = cdao.cmtDelete(comment);

		if (result > 0) {
			commentList = cdao.cList(comment.getCbNum());
		} else {
			commentList = null;
		}

		return commentList;
	}

	public List<COMMENT> cmtModify(COMMENT comment) {
		List<COMMENT> commentList;

		int result = cdao.cmtModify(comment);

		if (result > 0) {
			commentList = cdao.cList(comment.getCbNum());
		} else {
			commentList = null;
		}


		return commentList;
	}

}
