package com.example.cookiecafetest.member.controller;


import com.example.cookiecafetest.member.dto.MemberDTO;
import com.example.cookiecafetest.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    MemberService ms;


    @PostMapping("/signup")
    public int signup(MemberDTO memberDTO){
        return ms.signup(memberDTO);

    }

    @PostMapping("/login")
    public MemberDTO login(MemberDTO memberDTO, HttpSession session){
        MemberDTO member = ms.login(memberDTO);
        if (member != null) {
            session.setAttribute("id", member);
            return member;
        }
        return null;
    }

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
