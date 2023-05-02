package com.moriaty.hermes.ctrl;

import com.moriaty.hermes.service.TestService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * Test Ctrl
 * </p>
 *
 * @author Moriaty
 * @since 2023/5/2 下午10:25
 */
@RestController
@RequestMapping("test")
@AllArgsConstructor
@Slf4j
public class TestCtrl {

    private final TestService testService;

    /**
     * say hello
     *
     * @return String
     */
    @GetMapping("sayHello")
    public String sayHello() {
        log.info("/test/sayHello");
        return testService.sayHello();
    }
}
