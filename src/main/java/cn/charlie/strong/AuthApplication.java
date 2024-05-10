package cn.charlie.strong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author charlie
 * @date 2024/4/25 16:18
 **/
@SpringBootApplication
@MapperScan("cn.charlie.strong.mapper")
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
}
