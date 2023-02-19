package com.icia.membershipboot.dto;

import java.sql.Date;

import lombok.Data;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@Alias("comment")
public class COMMENT {
	private int cmtNum;				// 댓글번호
	private int cbNum;				// 게시글번호
	private String cmtWriter;		// 댓글작성자
	private String cmtContent;		// 댓글내용
	private Date cmtDate;			// 댓글작성일
	private String boardCotegery;	// 게시판종류
}
