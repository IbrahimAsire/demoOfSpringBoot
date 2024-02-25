package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository ) {
        return args -> {
            Student ibrahim = new Student(
                    "Ibrahim",
                    "ibra@i.com",
                    LocalDate.of(2002, FEBRUARY, 2)
            );
            Student ahmed = new Student(
                    "Ahmed",
                    "ahmed@a.com",
                    LocalDate.of(2004, MAY, 18)
            );

            repository.saveAll(
                    List.of(ibrahim, ahmed)
            );

        };
    }
}
