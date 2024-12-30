package com.goblin.chatserver.domain.member.mock;

import com.goblin.chatserver.domain.member.model.Member;
import com.goblin.chatserver.domain.member.service.port.MemberRepository;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

public class MockMemberRepository implements MemberRepository {

    private final AtomicLong index = new AtomicLong(0);
    private final List<Member> members = new ArrayList<>();

    @Override
    public Member save(Member member){
        if (Objects.isNull(member.id())) {
            Member newMember = Member.builder()
                    .id(index.incrementAndGet())
                    .name(member.name())
                    .build();

            members.add(newMember);
            return newMember;
        }
        return member;
    }

    @Override
    public Member findById(Long id) {
        return null;
    }

    @Override
    public Member findByName(String name) {
        return null;
    }
}
