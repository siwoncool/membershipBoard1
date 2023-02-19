package com.icia.membershipboot.dto;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Alias("board")
public class BOARD {
	private String boWriter;
	private String boTitle;
	private String boContent;
	private	Date boDate;
	
	private int boNum;
	private int boHit;
	
	private MultipartFile boFile;
	private String boFileName;
	
	private String boardCotegery;

}

