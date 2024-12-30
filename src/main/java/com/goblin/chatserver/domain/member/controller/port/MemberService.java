package com.goblin.chatserver.domain.member.controller.port;

import com.goblin.chatserver.domain.member.model.MemberCreate;

public interface MemberService {

    String create(MemberCreate memberCreate);
}
