package com.goblin.chatserver.domain.room.infrastructure.repository;

import com.goblin.chatserver.domain.room.infrastructure.entity.ChatRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomJpaRepository extends JpaRepository<ChatRoomEntity, Long> {

}
