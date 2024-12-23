package com.goblin.chatserver.domain.member.infrastructure.repository;

import com.goblin.chatserver.domain.member.infrastructure.entity.MemberEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberJpaRepository extends JpaRepository<MemberEntity, Long> {

    Optional<MemberEntity> findByName(String name);
}
