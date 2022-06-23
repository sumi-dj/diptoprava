package com.wipro.project.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.project.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
