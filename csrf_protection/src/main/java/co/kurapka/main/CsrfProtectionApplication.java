package co.kurapka.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by achmudas on 25/04/15.
 */
@SpringBootApplication
public class CsrfProtectionApplication {

    public static void main(String [] args) throws Exception {
        SpringApplication.run(CsrfProtectionApplication.class, args);
    }

}
