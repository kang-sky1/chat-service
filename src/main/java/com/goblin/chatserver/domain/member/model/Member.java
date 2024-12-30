package com.goblin.chatserver.domain.member.model;

import lombok.Builder;

@Builder
public record Member(
    Long id,
    String name
) {

    public static Member create(MemberCreate memberCreate) {
        return Member.builder()
            .name(memberCreate.name())
            .build();
    }
}
