package com.example.cookiecafetest.member.service;


import com.example.cookiecafetest.member.dto.MemberDTO;
import com.example.cookiecafetest.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {


    @Autowired
    MemberRepository mr;

    public int signup(MemberDTO memberDTO){
        int result = 0;
        try{
            result = mr.signup(memberDTO);
        }catch (Exception err){
            result = -1;
        }
        return result;
    }

    public MemberDTO login(MemberDTO memberDTO){
        return mr.login(memberDTO);
    }


}
