package com.example.cookiecafetest.member.service;


import com.example.cookiecafetest.member.dto.MemberDTO;
import com.example.cookiecafetest.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<MemberDTO> selectUserCart(String id){
        return mr.selectUserCart(id);
    }

    public ArrayList<MemberDTO> selectCart(String id){
        return mr.selectCart(id);
    }

    public int updateCartAmount(MemberDTO memberDTO){
        return mr.updateCartAmount(memberDTO);
    }

    public int insertCart(MemberDTO memberDTO){
        return mr.insertCart(memberDTO);
    }

    public int deleteCartAll(String param){
        return mr.deleteCartAll(param);
    }

    public int deleteCart(MemberDTO param){
        return mr.deleteCart(param);
    }

    public int selectAvailAmount(MemberDTO memberDTO){
        return mr.selectAvailAmount(memberDTO);
    }

    public int updateAmountProduct(MemberDTO memberDTO){
        return mr.updateAmountProduct(memberDTO);
    }

    public int insertOrderBook(MemberDTO memberDTO){
        return mr.insertOrderBook(memberDTO);
    }

    public int insertOrderDetail(MemberDTO memberDTO){
        return mr.insertOrderDetail(memberDTO);
    }

    public ArrayList<MemberDTO> selectOrderDetail(MemberDTO memberDTO){
        return mr.selectOrderDetail(memberDTO);

    }
    public ArrayList<MemberDTO> selectOrderBook(String id){
        return mr.selectOrderBook(id);
    }
}
