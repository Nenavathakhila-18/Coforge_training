package com.coforge.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//starting point of the project

/*annotation to specify the main class
combination of three annotation @configuration - configuration all the bean objects,
 * @EnableAutoConfiguration-Automatically 
 * configures the application based on the dependencies in your project.,
 * @ComponentScan-to scan our base package.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SbEmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbEmsApplication.class, args);
	}

}