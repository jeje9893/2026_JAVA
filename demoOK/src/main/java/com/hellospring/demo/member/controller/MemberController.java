package com.hellospring.demo.member.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hellospring.demo.member.controller.dto.JoinRequest;
import com.hellospring.demo.member.repository.entity.Member;
import com.hellospring.demo.member.service.MemberService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequiredArgsConstructor
public class MemberController {
    
    private final MemberService memberService;

    @GetMapping("/hello")
    public String getHello() {
        return "안녕하세요 동의대학교 학생 여러분";
    }
    
    @PostMapping("/members/join")
    public String join(@RequestBody JoinRequest joinRequest) {
        
        String result = memberService.Join(joinRequest);
        if ("success".equalsIgnoreCase(result)) {
            return "success";
        } else {
            return "fail";
        }
    }

    // @GetMapping("/members/hello")
    // public String getMember() {
    //     return memberService.getMember();
    // }
    
    @GetMapping("/members/{index}")
    public Member findByIdMember(@PathVariable Long index) {
        return memberService.findById(index);
    }

    @GetMapping("/members")
    public List<Member> findByAllMembers() {
        return memberService.findByAll();
    }
    
    

}
