package pe.edu.upeu.SISRA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@ComponentScan
@CrossOrigin(origins = "*")
public class SisraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisraApplication.class, args);
	}

}
