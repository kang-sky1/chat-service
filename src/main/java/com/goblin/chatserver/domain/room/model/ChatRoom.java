package com.goblin.chatserver.domain.room.model;

import com.goblin.chatserver.domain.room.dto.ChatRoomCreate;
import lombok.Builder;

@Builder
public record ChatRoom(
        Long id,
        String title
) {

    public static ChatRoom create(ChatRoomCreate chatRoomCreate){
        return ChatRoom.builder()
                .title(chatRoomCreate.title())
                .build();
    }
}
