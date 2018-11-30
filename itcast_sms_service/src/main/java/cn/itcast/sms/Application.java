package cn.itcast.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//其实就是三个注解的总和：@Configuration、@EnableAutoConfiguration、@ComponentScan

@SpringBootApplication
public class Application {

	public static void main(String[] args) {		
		SpringApplication.run(Application.class, args);
	}

}
