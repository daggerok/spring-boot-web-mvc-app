package daggerok;

import daggerok.config.WebInterceptorConfig;
import daggerok.config.RestRepositoryConfig;
import daggerok.data.Profile;
import daggerok.data.ProfileRestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import java.util.stream.Stream;

@SpringBootApplication
@Import({
        RestRepositoryConfig.class,
        WebInterceptorConfig.class })
public class SpringBootStormpathApplication {

    @Bean
    CommandLineRunner testData(ProfileRestRepository profiles) {

        return args -> Stream.of("one", "two", "three")
                .map(Profile::of)
                .forEach(profiles::save);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStormpathApplication.class, args);
    }
}
