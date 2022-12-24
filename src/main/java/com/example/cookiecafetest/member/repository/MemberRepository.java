package com.example.cookiecafetest.member.repository;

import com.example.cookiecafetest.mapper.MemberMapper;
import com.example.cookiecafetest.member.dto.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

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

    public ArrayList<MemberDTO> selectUserCart(String id){
        return mapper.selectUserCart(id);
    }

    public ArrayList<MemberDTO> selectCart(String id){
        return mapper.selectCart(id);
    }

    public int updateCartAmount(MemberDTO memberDTO){
        return mapper.updateCartAmount(memberDTO);
    }

    public int insertCart(MemberDTO memberDTO){
        return mapper.insertCart(memberDTO);
    }

    public int deleteCartAll(String param){
        return mapper.deleteCartAll(param);
    }

    public int deleteCart(MemberDTO param){
        return mapper.deleteCart(param);
    }

    public int selectAvailAmount(MemberDTO memberDTO){
        return mapper.selectAvailAmount(memberDTO);
    }

    public int updateAmountProduct(MemberDTO memberDTO){
        return mapper.updateAmountProduct(memberDTO);
    }

    public int insertOrderBook(MemberDTO memberDTO){
        return mapper.insertOrderBook(memberDTO);
    }

    public int insertOrderDetail(MemberDTO memberDTO){
        return mapper.insertOrderDetail(memberDTO);
    }

    public ArrayList<MemberDTO> selectOrderDetail(MemberDTO memberDTO){
        return mapper.selectOrderDetail(memberDTO);

    }
    public ArrayList<MemberDTO> selectOrderBook(String id){
        return mapper.selectOrderBook(id);
    }



}
