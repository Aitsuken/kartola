package clyde.kartola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@RestController
public class KartolaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KartolaApplication.class, args);
    }

    @GetMapping
    public String Hello() {
        return "Hello World!";
    }
}
