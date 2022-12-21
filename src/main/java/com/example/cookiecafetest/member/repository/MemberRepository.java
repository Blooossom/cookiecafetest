package com.example.cookiecafetest.member.repository;

import com.example.cookiecafetest.mapper.MemberMapper;
import com.example.cookiecafetest.member.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;


    public int signup(MemberDTO memberDTO){
        return mapper.signup(memberDTO);
    }


    public MemberDTO login(MemberDTO memberDTO){
        return mapper.login(memberDTO);
    }



}
