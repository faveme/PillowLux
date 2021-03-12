package com.revature.services;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dto.CustomerDTO;
import com.revature.models.Customer;
import com.revature.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerDAO;	

	public Customer find(int id) {
		System.out.println("In find service");
		Optional<Customer> cust = customerDAO.findById(id);
		if(cust.isPresent()) {
			return cust.get();
		}
		else {
			return new Customer();
		}
	
	}
	public Customer create(CustomerDTO customer) {
		Customer cc = new Customer();
		cc.setAddress(customer.getAddress());
		cc.setCity(customer.getCity());
		cc.setDob(customer.getDob());
		cc.setEmail(customer.getEmail());
		cc.setFName(customer.getFirst_name());
		cc.setLName(customer.getLast_name());
		cc.setPassword(customer.getPassword());
		cc.setState(customer.getState());
		cc.setDateOfBirth(LocalDate.now());
		System.out.println("In create service");
		System.out.println(cc);
		return customerDAO.save(cc); 
	}
}
