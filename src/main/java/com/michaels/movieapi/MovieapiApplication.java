package com.michaels.movieapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing


public class MovieapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieapiApplication.class, args);
    }

}
