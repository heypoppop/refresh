package com.example.refresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class RefreshApplication {

    public static void main(String[] args) {
        SpringApplication.run(RefreshApplication.class, args);
    }

}
