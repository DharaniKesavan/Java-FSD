package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages={"com.example"})
@Configuration
@EnableAutoConfiguration(
exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class Phase3Practice2FeedbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(Phase3Practice2FeedbackApplication.class, args);
	}

}
