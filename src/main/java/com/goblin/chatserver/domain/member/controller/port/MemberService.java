package com.goblin.chatserver.domain.member.controller.port;

import com.goblin.chatserver.domain.member.model.Member;
import com.goblin.chatserver.domain.member.model.MemberCreate;

public interface MemberService {

    Member create(MemberCreate memberCreate);
}
