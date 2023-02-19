package com.icia.membershipboot.dto;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("paging")
public class PAGE {
	private int page=1;
	private int maxPage;
	private int startPage;
	private int endPage;
	private int startRow;
	private int endRow;
	private int limit;

	private String category;
	private String keyword=null;
	private String boardCotegery;


}
