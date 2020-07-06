package com.cap_coder.Spring.Boot.With.MYSQL;

import com.cap_coder.Spring.Boot.With.MYSQL.Repository.productRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootWithMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithMysqlApplication.class, args);
	}

}
