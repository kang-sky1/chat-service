package com.goblin.chatserver.domain.member.service;

import com.goblin.chatserver.domain.member.controller.port.MemberService;
import com.goblin.chatserver.domain.member.model.Member;
import com.goblin.chatserver.domain.member.model.MemberCreate;
import com.goblin.chatserver.domain.member.service.port.MemberRepository;
import com.goblin.chatserver.global.JwtProvider;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member create(MemberCreate memberCreate) {
        Member member = Member.create(memberCreate);
        return memberRepository.save(member);
    }
}
