package com.learning;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.entity.Account;
import com.learning.repository.AccountRepository;

@SpringBootApplication
public class SbmsWithProceduresApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbmsWithProceduresApplication.class, args);
		AccountRepository accountRepository = context.getBean(AccountRepository.class);
		List<Account> allAccounts = accountRepository.getAllAccounts();
		allAccounts.forEach(System.out::println);
	}

}
