package com.example.demo.member.repository;

import org.springframework.stereotype.Repository;

// 데이터 저장소 역할을 하는 Spring Bean으로 등록한다.
// @Repository
// public interface MemberRepository extends {

	
// } 

@Repository
public class MemberRepository {
	// 실제 데이터 저장소 구현은 생략한다.
	// 과제 요구사항에서는 데이터 저장소 구현이 필요하지 않다.

	public String findMember() {
		return "Member Data";
	}
}