package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
