package com.goblin.chatserver.domain.member.model;

import lombok.Builder;

@Builder
public record Member(
    Long id,
    String name
) {

    public static Member create(String name, String password) {
        return Member.builder()
            .name(name)
            .build();
    }
}
