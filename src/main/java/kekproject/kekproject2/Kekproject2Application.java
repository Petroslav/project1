package kekproject.kekproject2;

import kekproject.kekproject2.models.Category;
import kekproject.kekproject2.models.Comment;
import kekproject.kekproject2.models.Post;
import kekproject.kekproject2.models.User;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@SpringBootApplication
public class Kekproject2Application {

    public static void main(String[] args) {

        SpringApplication.run(Kekproject2Application.class, args);
        //TODO питай пешо дали тези индекси реално са форен кий блят


    }
}