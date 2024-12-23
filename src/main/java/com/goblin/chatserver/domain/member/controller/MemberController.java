package com.goblin.chatserver.domain.member.controller;

import com.goblin.chatserver.domain.member.controller.port.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/members")
public class MemberController {

    private final MemberService memberService;
}
