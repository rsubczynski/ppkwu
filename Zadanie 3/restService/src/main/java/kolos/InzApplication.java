package kolos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class InzApplication {

	public static void main(String[] args) {
		SpringApplication.run(InzApplication.class, args);
	}
}
