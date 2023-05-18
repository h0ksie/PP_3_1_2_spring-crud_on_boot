package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootConfiguration
@SpringBootApplication
public class AppRunner extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }
}
