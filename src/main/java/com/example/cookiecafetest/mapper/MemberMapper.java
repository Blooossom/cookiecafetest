package com.example.cookiecafetest.mapper;

import com.example.cookiecafetest.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface MemberMapper {

    public int signup(MemberDTO memberDTO);

    public MemberDTO login(MemberDTO memberDTO);

    public ArrayList<MemberDTO> selectUserCart(String id);

    public ArrayList<MemberDTO> selectCart(String id);

    public int updateCartAmount(MemberDTO memberDTO);

    public int insertCart(MemberDTO memberDTO);

    public int deleteCartAll(String param);
    public int deleteCart(MemberDTO memberDTO);
    public int updateAmountProduct(MemberDTO memberDTO);
    public int selectAvailAmount(MemberDTO memberDTO);
    public int insertOrderBook(MemberDTO memberDTO);
    public int insertOrderDetail(MemberDTO memberDTO);

    public ArrayList<MemberDTO> selectOrderDetail(MemberDTO memberDTO);

    public ArrayList<MemberDTO> selectOrderBook(String id);
}
