package com.icia.membershipboot.dao;

import com.icia.membershipboot.dto.COMMENT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CDAO {

    List<COMMENT> cList(int cbNum);

    int cmtWrite(COMMENT comment);

    int cmtDelete(COMMENT comment);

    int cmtModify(COMMENT comment);
}
