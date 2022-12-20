package com.greenswap.greenswap;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class GreenswapApplication {
	/**
	 * start API
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		new SpringApplicationBuilder(GreenswapApplication.class)
		.registerShutdownHook(true)
		.run(args);
	}
}
