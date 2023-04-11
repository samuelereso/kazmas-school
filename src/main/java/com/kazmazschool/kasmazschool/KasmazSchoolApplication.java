package com.kazmazschool.kasmazschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.kazmazschool.kasmazschool.repository")
@EntityScan("com.kazmazschool.kasmazschool.model")
public class KasmazSchoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(KasmazSchoolApplication.class, args);
    }

}
