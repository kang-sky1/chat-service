package com.goblin.chatserver.domain.member.service;

import com.goblin.chatserver.domain.member.controller.port.MemberService;
import com.goblin.chatserver.domain.member.model.Member;
import com.goblin.chatserver.domain.member.model.MemberCreate;
import com.goblin.chatserver.domain.member.service.port.MemberRepository;
import com.goblin.chatserver.global.util.JwtProvider;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final JwtProvider jwtProvider;

    @Override
    public String create(MemberCreate memberCreate) {
        Member member = Member.create(memberCreate);
        Member save = memberRepository.save(member);
        return jwtProvider.createToken(String.valueOf(save.id()));
    }
}
