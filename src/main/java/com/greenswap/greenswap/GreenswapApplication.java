package com.greenswap.greenswap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GreenswapApplication {
	/**
	 * start API
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(GreenswapApplication.class, args)
		//.registerShutdownHook(true)
		//.run(args);
		;
	}

}
