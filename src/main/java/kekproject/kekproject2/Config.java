package kekproject.kekproject2;

//import com.fasterxml.jackson.databind.Module;
//import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import kekproject.kekproject2.models.*;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SessionFactory createFactory(){
        System.out.println("SessionFactory initialized successfully.");
        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .addAnnotatedClass(Post.class)
                .addAnnotatedClass(Comment.class)
                .addAnnotatedClass(Category.class)
                .buildSessionFactory();
    }

    // TODO Пепи, това го откоментирай, ако ти дава проблеми с JSON
//    @Bean
//    public Module datatypeHibernateModule() {
//        return new Hibernate4Module();
//    }
}
