package com.goblin.chatserver.domain.room.model;

import com.goblin.chatserver.domain.member.model.Member;

public record ChatMember(
        Member member,
        ChatRoom chatRoom
) {


}
