package com.example.demo.student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student raad1 = new Student(
                    "Raad",
                    "Rkasem@gmail.com",
                    LocalDate.of(1992, SEPTEMBER, 29)
            );
            Student alex = new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(1998, JANUARY, 5)
            );
            repository.saveAll(List.of(raad1,alex));
        };
    }
}
