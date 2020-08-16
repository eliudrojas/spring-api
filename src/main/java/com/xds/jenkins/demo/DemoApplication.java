package com.xds.jenkins.demo;


import com.xds.jenkins.entity.ThemeParkRide;
import com.xds.jenkins.repository.ThemeParkRideRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.xds")
@EnableJpaRepositories("com.xds.jenkins.repository")
@EntityScan("com.xds.jenkins.entity")
public class DemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class);
	}

	@Bean
	public CommandLineRunner sampleData(ThemeParkRideRepository repository) {
		return (args) -> {
			repository.save(new ThemeParkRide(Long.valueOf("1"),"Rollercoaster", "Train ride that speeds you along.", 5, 3));
			repository.save(new ThemeParkRide(Long.valueOf("2"),"Log flume", "Boat ride with plenty of splashes.", 3, 2));
			repository.save(new ThemeParkRide(Long.valueOf("3"),"Teacups", "Spinning ride in a giant tea-cup.", 2, 4));
		};
	}
}