package ai.test.com.tr.apptestcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan({"ai.test.com.tr.services"})
@EnableAutoConfiguration
public class AppTestCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppTestCoreApplication.class, args);
	}
}
