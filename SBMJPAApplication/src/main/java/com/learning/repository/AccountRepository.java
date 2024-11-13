package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entities.Account;
import com.learning.entities.AccountKey;

public interface AccountRepository extends JpaRepository<Account, AccountKey> {

}
