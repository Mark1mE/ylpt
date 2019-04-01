package io.renren;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * @description:
 * @author: 么红帅
 * @date: 2019/3/25 1:17
 */

@SpringBootApplication
@EnableJpaAuditing
public class Ylpt {
    public static void main(String[] args) {
        SpringApplication.run(Ylpt.class, args);
    }
}
