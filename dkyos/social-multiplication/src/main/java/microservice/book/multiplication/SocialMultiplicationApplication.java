package microservice.book.multiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocialMultiplicationApplication {

	public static void main(String[] args) {
		System.out.println("hello start");
		SpringApplication.run(SocialMultiplicationApplication.class, args);
	}

}
