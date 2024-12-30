package com.goblin.chatserver.domain.member.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("유저 정보를 받으면 유저를 생성한다.")
    void createMember() {

    }
}