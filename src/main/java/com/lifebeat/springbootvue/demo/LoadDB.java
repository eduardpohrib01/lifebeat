package com.lifebeat.springbootvue.demo;
import com.lifebeat.springbootvue.entity.User;
import com.lifebeat.springbootvue.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDB {

    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new User("user1@gmail.com", "burglar")));
            log.info("Preloading " + repository.save(new User("user@gmail.com", "thief")));
        };
    }
}
