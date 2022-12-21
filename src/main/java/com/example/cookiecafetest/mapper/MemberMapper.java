package com.example.cookiecafetest.mapper;

import com.example.cookiecafetest.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    public int signup(MemberDTO memberDTO);

    public MemberDTO login(MemberDTO memberDTO);


}
