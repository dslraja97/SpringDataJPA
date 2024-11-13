package com.learning;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learning.entities.Account;
import com.learning.entities.AccountKey;
import com.learning.repository.AccountRepository;

@SpringBootApplication
public class SbmjpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbmjpaApplication.class, args);
		AccountRepository accountRepository = context.getBean(AccountRepository.class);
		AccountKey accountKey = new AccountKey();
		accountKey.setAcctNumber(123456);
		accountKey.setId(5);
		accountKey.setType("minor");
		Account account = new Account();
		account.setAccountKey(accountKey);
		account.setBranch("KPM");
		account.setName("Ganesha");

		accountRepository.save(account);
		Optional<Account> findById = accountRepository.findById(accountKey);
		System.out.println(findById.get());
	}

}
