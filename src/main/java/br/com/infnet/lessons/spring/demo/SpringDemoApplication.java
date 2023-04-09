package br.com.infnet.lessons.spring.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringDemoApplication {

	private static final Logger LOG = LoggerFactory.getLogger(SpringDemoApplication.class);

	public static void main(String[] args) {
		LOG.info("INFO: LOGGING...");
		SpringApplication.run(SpringDemoApplication.class, args);
	}
}
