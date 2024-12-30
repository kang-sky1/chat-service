package com.goblin.chatserver.domain.member.controller;

import com.goblin.chatserver.domain.member.controller.port.MemberService;
import com.goblin.chatserver.domain.member.model.MemberCreate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/api/members")
public class MemberController {

    private final MemberService memberService;

    @PostMapping
    public ResponseEntity createMember(
            @Validated MemberCreate memberCreate
    ){
        memberService.create(memberCreate);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }
}
