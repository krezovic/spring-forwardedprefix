package com.github.krezovic.forwardedprefix;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.reactive.server.WebTestClient;

class ForwardedPrefixRestTestBase {
    @Autowired
    private WebTestClient client;

    @Test
    void test() {
        client.get().uri("/test")
              .header("X-Forwarded-Prefix", "/forwardedprefix,/")
              .exchange()
              .expectBody(String.class)
              .value(Matchers.equalTo("Howdy"));
    }
}