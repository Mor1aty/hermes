package com.moriaty.hermes.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * Test Service
 * </p>
 *
 * @author Moriaty
 * @since 2023/5/2 下午10:26
 */
@Service
@AllArgsConstructor
@Slf4j
public class TestService {


    /**
     * say hello
     *
     * @return String
     */
    public String sayHello() {
        log.info("say hello");
        return "hello";
    }
}
