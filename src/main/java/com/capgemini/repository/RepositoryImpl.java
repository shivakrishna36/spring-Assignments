package com.capgemini.repository;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.model.Customer;

public class RepositoryImpl implements Repository {

	
	public List<Customer> findAll() {
			List<Customer> customers = new ArrayList<Customer>();
			Customer customer = new Customer();
			customer.setFirstName("Shiva Krishna");
			customer.setLastName("Gunji");
			customers.add(customer);
			return customers;
		}
	}
	
	

