package com.goblin.chatserver.domain.member.service.port;

import com.goblin.chatserver.domain.member.model.Member;

public interface MemberRepository {

    Member save(Member member);
    Member findById(Long id);
    Member findByName(String name);
}
