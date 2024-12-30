package com.goblin.chatserver.domain.member.service;

import static org.junit.jupiter.api.Assertions.*;

import com.goblin.chatserver.domain.member.controller.port.MemberService;
import com.goblin.chatserver.domain.member.mock.MockMemberRepository;
import com.goblin.chatserver.domain.member.model.Member;
import com.goblin.chatserver.domain.member.model.MemberCreate;
import com.goblin.chatserver.domain.member.service.port.MemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MemberServiceImplTest {

    private MemberService memberService;
    private MemberRepository memberRepository;

    @BeforeEach
    void setUp() {
        memberRepository = new MockMemberRepository();
        memberService = new MemberServiceImpl(memberRepository);
    }


    @Test
    @DisplayName("유저 정보를 받으면 유저를 생성한다.")
    void createMember() {
        MemberCreate memberCreate = new MemberCreate("user");

        Member result = memberService.create(memberCreate);

        Assertions.assertThat(result.id()).isNotNull();
    }
}