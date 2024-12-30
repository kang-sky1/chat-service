package com.goblin.chatserver.global.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JwtProviderTest {

    private JwtProvider jwtProvider = new JwtProvider(
        "4714559cf0bd05573220c2b5f0e4f55cb2668679de7e5e5db7afd01c5c3ea0dac72f9e4fb717758e381d7af50b335bdb8768cd95a4deafbb7fb74ded50cc2e9d"
    );

    @Test
    @DisplayName("아이디를 넣으면 토큰을 생성한다")
    void createToken() {
        String token = jwtProvider.createToken(String.valueOf(1L));

        Assertions.assertThat(token).isNotNull();
        Assertions.assertThat(token).isNotBlank();
        Assertions.assertThat(token).startsWith("Bearer ");
    }

    @Test
    @DisplayName("토큰을 넣으면 아이디를 추출한다")
    void getMemberIdFromToken() {
        long memberId = 1L;
        String token = jwtProvider.createToken(String.valueOf(memberId)).replace("Bearer ", "");

        System.out.println(token);

        String subject = jwtProvider.getMemberInfoFromToken(token);
        Long result = Long.parseLong(subject);

        Assertions.assertThat(result).isEqualTo(memberId);
        Assertions.assertThat(result).isNotZero();
        Assertions.assertThat(result).isNotNegative();

    }

}