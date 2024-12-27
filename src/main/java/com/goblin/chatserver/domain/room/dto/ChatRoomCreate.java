package com.goblin.chatserver.domain.room.dto;

import jakarta.validation.constraints.NotEmpty;

public record ChatRoomCreate(
        @NotEmpty(message = "방 제목을 필수입니다.")
        String title
) {
}
