package com.goblin.chatserver.domain.member.service;

import static org.junit.jupiter.api.Assertions.*;

import com.goblin.chatserver.domain.member.controller.port.MemberService;
import com.goblin.chatserver.domain.member.mock.MockMemberRepository;
import com.goblin.chatserver.domain.member.model.Member;
import com.goblin.chatserver.domain.member.model.MemberCreate;
import com.goblin.chatserver.domain.member.service.port.MemberRepository;
import com.goblin.chatserver.global.util.JwtProvider;
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
        memberService = new MemberServiceImpl(memberRepository, new JwtProvider("4714559cf0bd05573220c2b5f0e4f55cb2668679de7e5e5db7afd01c5c3ea0dac72f9e4fb717758e381d7af50b335bdb8768cd95a4deafbb7fb74ded50cc2e9d"));
    }


    @Test
    @DisplayName("유저 정보를 받으면 유저를 생성한다.")
    void createMember() {
        MemberCreate memberCreate = new MemberCreate("user");

        String result = memberService.create(memberCreate);

        Assertions.assertThat(result).isNotNull();
    }
}