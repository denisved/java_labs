package ua.lviv.iot.machinery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.machinery.controllers", "ua.lviv.iot.machinery.service" })
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

