package com.goblin.chatserver.domain.member.infrastructure.repository;

import com.goblin.chatserver.domain.member.infrastructure.entity.MemberEntity;
import com.goblin.chatserver.domain.member.model.Member;
import com.goblin.chatserver.domain.member.service.port.MemberRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepository {

    private final MemberJpaRepository memberJpaRepository;

    @Override
    public Member save(Member member) {
        return memberJpaRepository.save(MemberEntity.create(member)).to();
    }

    @Override
    public Member findById(Long id) {
        return memberJpaRepository.findById(id)
            .orElseThrow(() -> new EntityNotFoundException())
            .to();
    }

    @Override
    public Member findByName(String name) {
        return memberJpaRepository.findByName(name)
            .orElseThrow(() -> new EntityNotFoundException())
            .to();
    }
}
