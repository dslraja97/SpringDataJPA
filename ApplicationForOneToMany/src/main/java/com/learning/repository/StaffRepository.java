package com.learning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.entity.Staffs;

public interface StaffRepository extends JpaRepository<Staffs, Integer> {

}
