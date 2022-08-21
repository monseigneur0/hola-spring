package jpabook.jpashop.service;

import jpabook.jpashop.domain.Member;
import jpabook.jpashop.repository.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.fail;


@SpringBootTest
@Transactional
public class MemberServiceTest2 {

    @Autowired
    MemberService memberService;
    @Autowired
    MemberRepository memberRepository;

    @Test
    public void 회원가입() throws Exception {
        //given
        Member member1 = new Member();
        member1.setName("kim");
        //when
        Long saveId = memberService.join(member1);
        //then
        Assertions.assertThat(member1).isEqualTo(memberRepository.findOne(saveId));
    }

    @Test
    public void 중복회원검사() throws Exception {

        //given
        Member member1 = new Member();
        Member member2 = new Member();
        member1.setName("kim");
        member2.setName("kim");
        //when
        long saveId1 = memberService.join(member1);
        long saveId2 = memberService.join(member2);
        //then
        fail("예외가 발생");



    }
}
