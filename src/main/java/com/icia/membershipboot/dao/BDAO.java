package com.icia.membershipboot.dao;

import com.icia.membershipboot.dto.BOARD;
import com.icia.membershipboot.dto.PAGE;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BDAO {
    int bWrite(BOARD board);

    int bCount(PAGE paging);

    List<BOARD> bList(PAGE paging);

    List<BOARD> bSearch(PAGE search);

    BOARD bView(BOARD board);

    int bModify(BOARD board);

    int bDelete(BOARD board);

    List<BOARD> cList(BOARD board);
}
