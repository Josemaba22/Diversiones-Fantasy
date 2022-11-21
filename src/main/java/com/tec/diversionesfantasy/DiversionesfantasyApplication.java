package com.tec.diversionesfantasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.tec.diversionesfantasy.*")
@EntityScan("com.tec.diversionesfantasy.entity")
@EnableJpaRepositories("com.tec.diversionesfantasy.repository")
public class DiversionesfantasyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiversionesfantasyApplication.class, args);
	}

}
