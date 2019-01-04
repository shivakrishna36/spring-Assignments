package com.capgemini.service;

import java.util.List;

import com.capgemini.model.Customer;
import com.capgemini.repository.Repository;

public class CustomerServiceImpl implements CustomerService {

	private Repository repository;

	public CustomerServiceImpl() {

	}

	public CustomerServiceImpl(Repository repository) {
		this.repository = repository;
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public List<Customer> findAll() {
		return repository.findAll();
	}

}