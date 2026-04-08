package com.hellospring.demo.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hellospring.demo.member.controller.dto.JoinRequest;
import com.hellospring.demo.member.repository.MemberRepository;
import com.hellospring.demo.member.repository.entity.Member;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {


    private final MemberRepository memberRepository;

    /*
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    */

    @Override
    public String Join(JoinRequest joinRequest) {
        Member member = Member.builder()
                        .id(joinRequest.getId())
                        .name(joinRequest.getName())
                        .age(joinRequest.getAge())
                        .hobby(joinRequest.getHobby())
                        .build();
        memberRepository.save(member);
        return "success";
    }

    @Override
    public String getMember() {
        return "Hello DEU!";
    }
    
    @Override
    public Member findById(Long index) {
        return memberRepository.findById(index).orElseThrow();
    }

    @Override
    public List<Member> findByAll() {
        return memberRepository.findAll();
    }
}
