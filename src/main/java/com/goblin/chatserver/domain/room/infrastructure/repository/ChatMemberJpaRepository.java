package com.goblin.chatserver.domain.room.infrastructure.repository;

import com.goblin.chatserver.domain.room.infrastructure.entity.ChatMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatMemberJpaRepository extends JpaRepository <ChatMemberEntity, Long> {
}
