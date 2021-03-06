package org.serviceTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 *
 */

@EnableTransactionManagement
@SpringBootApplication
@EnableEurekaClient
public class ServiceTwoApp {
	public static void main(String[] args) {
		SpringApplication.run(ServiceTwoApp.class, args);
	}
}
