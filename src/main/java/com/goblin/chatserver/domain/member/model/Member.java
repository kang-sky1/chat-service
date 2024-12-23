package com.goblin.chatserver.domain.member.model;

import lombok.Builder;

@Builder
public record Member(
    Long id,
    String name,
    String password
) {

    public static Member of(String name, String password) {
        return Member.builder()
            .name(name)
            .password(password)
            .build();
    }
}
