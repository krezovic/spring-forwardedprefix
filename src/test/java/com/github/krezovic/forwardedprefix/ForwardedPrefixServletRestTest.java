package com.github.krezovic.forwardedprefix;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("servlet")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ForwardedPrefixServletRestTest extends ForwardedPrefixRestTestBase {}
