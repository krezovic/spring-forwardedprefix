package com.github.krezovic.forwardedprefix;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("reactive")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ForwardedPrefixReactiveRestTest extends ForwardedPrefixRestTestBase {}
