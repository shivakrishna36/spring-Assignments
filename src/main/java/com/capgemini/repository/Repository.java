package com.capgemini.repository;

import java.util.List;

import com.capgemini.model.Customer;

public interface Repository {

	List<Customer> findAll();

}