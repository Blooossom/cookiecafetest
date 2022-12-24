package com.example.cookiecafetest.member.controller;


import com.example.cookiecafetest.member.dto.MemberDTO;
import com.example.cookiecafetest.member.service.MemberService;
import com.example.cookiecafetest.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class MemberController {


    @Autowired
    MemberService ms;

    @Autowired
    ProductService ps;

    @GetMapping("/selectUserCart")
    public ArrayList<MemberDTO> selectUserCart(HttpSession session){
        String id = String.valueOf(session.getAttribute("id"));
        return ms.selectOrderBook(id);
    }

    @GetMapping("/selectCart")
    public ArrayList<MemberDTO> selectCart(HttpSession session){
        String id = String.valueOf(((MemberDTO)session.getAttribute("id")).getId());
        return ms.selectCart(id);
    }

    @PostMapping("/deleteCart")
    public String deleteCart(String id, HttpSession session){
        String userId = null;

    }

}
