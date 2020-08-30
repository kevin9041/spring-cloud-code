package cn.springcloud.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * http://www.springboottutorial.com/spring-boot-and-spring-jdbc-with-h2
 */
@SpringBootApplication
@EnableConfigServer
public class Ch311ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch311ConfigServerApplication.class, args);
    }
}
