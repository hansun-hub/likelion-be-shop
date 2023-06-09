package com.likelion.beshop.repository;

import com.likelion.beshop.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@TestPropertySource(locations = "classpath:application-test.properties")
public class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @DisplayName("회원가입 테스트")
    public void createMemberTest(){
        Member member = new Member();
        member.setName("장효선");
        member.setEmail("hosu0125@naver.com");
        member.setPassword("hyoseon1234");
        member.setAddress("서울시 광진구 화양동");
        Member savedMember = memberRepository.save(member);
        System.out.println(savedMember.toString());
    }

}
