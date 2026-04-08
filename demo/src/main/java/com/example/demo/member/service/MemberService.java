package com.example.demo.member.service;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

// Spring이 관리하는 서비스(비즈니스 로직) 빈으로 등록한다.
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    // 생성자 주입(DI) 방식: 스프링이 MemberRepository를 자동으로 넣어준다.
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

	// 멤버 관련 메시지를 반환한다.
	public String getMember() {
		// 과제 요구사항: "Hello DEU!" 반환
		return "Hello DEU!";
	}

    @Transactional
    public Member saveMember(String name) {
        Member member = Member.builder()
                .name(name)
                .build();
        memberRepository.save(member);

        // @Transactional 테스트 : 아래 주석 해재 시 롤벡 가능
        // throw new RuntimeException("강제 예외 발생 시 롤백");
        return member;
    }


}
