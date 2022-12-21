package com.example.cookiecafetest.member.controller;


import com.example.cookiecafetest.member.dto.MemberDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MemberController {



    @PostMapping("/logout")
    public String logout(MemberDTO memberDTO, HttpSession session){
        if (session.getAttribute("id") == null) {
            return null;
        } else {
            session.setAttribute("id", null);
            return "success";
        }
    }



}
