package com.lib;

import com.code.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class NexusPutApplicationTests {

    @Test
    void contextLoads() {
        log.error("## => {}", CommonUtils.allAdd(3,4,3));
    }

}
