package com.learning;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.entity.Passport;
import com.learning.entity.People;
import com.learning.repository.PeopleRepository;

@SpringBootApplication
public class ApplicationForOneToOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(ApplicationForOneToOneApplication.class, args);
		Passport passport = new Passport();
		passport.setStatus("Active");
		passport.setIssueDate(LocalDate.now());
		passport.setExpiryDate(LocalDate.now().plusYears(10));
		People people = new People();
		people.setName("Ganesha");
		people.setSexCode("Male");
		people.setPassport(passport);
		passport.setPeople(people);
		PeopleRepository peopleRepository = configurableApplicationContext.getBean(PeopleRepository.class);
		peopleRepository.save(people);

	}

}
