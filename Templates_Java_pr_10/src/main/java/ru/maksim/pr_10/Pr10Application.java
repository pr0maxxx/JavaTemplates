package ru.maksim.pr_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.maksim.pr_10.interfaces.Programmer;

@SpringBootApplication
public class Pr10Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Pr10Application.class, args);

        try {
            Programmer programmer = context.getBean(args[0], Programmer.class);
            programmer.doCoding();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            System.err.println("Expected 1 command line argument, found 0!");
        };
    }


}
