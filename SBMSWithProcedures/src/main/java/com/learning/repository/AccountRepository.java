package com.learning.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.learning.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {

	@Query(value = "call getAccounts()", nativeQuery = true)
	public List<Account> getAllAccounts();

}
