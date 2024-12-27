package com.goblin.chatserver.domain.room.infrastructure.entity;

import com.goblin.chatserver.domain.member.infrastructure.entity.MemberEntity;
import com.goblin.chatserver.domain.room.model.ChatMember;
import com.goblin.chatserver.domain.room.model.ChatRoom;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class ChatMemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member")
    private MemberEntity member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_room")
    private ChatRoomEntity chatRoom;

    public static ChatMemberEntity create(ChatMember chatMember) {
        return ChatMemberEntity.builder()
            .member(MemberEntity.create(chatMember.member()))
            .chatRoom(ChatRoomEntity.create(chatMember.chatRoom()))
            .build();
    }
}
