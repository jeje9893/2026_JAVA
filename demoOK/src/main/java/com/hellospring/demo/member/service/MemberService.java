package com.hellospring.demo.member.service;

import java.util.List;

import com.hellospring.demo.member.controller.dto.JoinRequest;
import com.hellospring.demo.member.repository.entity.Member;

public interface MemberService {
    //String Join(String id, String name, int age, String hobby);
    String Join(JoinRequest joinRequest);

    String getMember();

    Member findById(Long index);

    List<Member> findByAll();
}
