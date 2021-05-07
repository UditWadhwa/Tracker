package org.tracker.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.tracker.system", "org.tracker.setup"})
public class Application {

    public static void main(String argv[]){
        SpringApplication.run(Application.class, argv);
    }

}
