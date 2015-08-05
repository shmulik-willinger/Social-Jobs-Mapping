package core.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories
@EnableAutoConfiguration
@EnableTransactionManagement
@ComponentScan(basePackages = "core")
public class SOMWebApplication {

    public static void main(String[] args) throws Exception {
       SpringApplication.run(SOMWebApplication.class, args);
    }
}
