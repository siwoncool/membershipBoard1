package com.icia.membershipboot.dao;

import com.icia.membershipboot.dto.MEMBER;
import com.icia.membershipboot.dto.PAGE;
import com.icia.membershipboot.dto.SEARCH;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MDAO {

    String idCheck(String memId);

    int mJoin(MEMBER member);

    String mLogin(MEMBER member);

    int emailCheck(MEMBER member);

    int mCount();

    List<MEMBER> mList(PAGE paging);

    List<MEMBER> mSearch(SEARCH search);

    MEMBER mView(String memId);

    int mModify(MEMBER member);

    int mDelete(String memId);
}
