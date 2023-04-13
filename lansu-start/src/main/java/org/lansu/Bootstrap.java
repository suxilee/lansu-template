package org.lansu;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot启动类
 *
 * @author feixuan-pc007
 * @date 2023/04/13
 */
@SpringBootApplication
@Slf4j
public class Bootstrap {
    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
        log.info("info测试");
        log.warn("warn测试");
        log.error("error测试");
    }
}
