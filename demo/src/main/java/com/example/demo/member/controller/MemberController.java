package com.example.demo.member.controller;

import com.example.demo.member.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// REST API 요청을 처리하는 컨트롤러로 등록한다.
@RestController
public class MemberController {

    // 서비스 빈을 주입받아 컨트롤러에서 사용한다.
    private final MemberService memberService;

    // 생성자 주입 방식: 스프링이 MemberService를 자동으로 넣어준다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    // GET /members 요청을 처리한다.
    @GetMapping("/members")
    public String getMembers() {
        // 실제 데이터/메시지 반환은 서비스에 위임한다.
        return memberService.getMember();
    }

}
