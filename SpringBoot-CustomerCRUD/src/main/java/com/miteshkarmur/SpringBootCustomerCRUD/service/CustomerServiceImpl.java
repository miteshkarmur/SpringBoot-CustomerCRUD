package com.miteshkarmur.SpringBootCustomerCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miteshkarmur.SpringBootCustomerCRUD.entity.Customer;
import com.miteshkarmur.SpringBootCustomerCRUD.repository.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepo customerRepo;

	@Override
	public List<Customer> listCustomers() {
		return customerRepo.findAll();
	}

	@Override
	public Integer addCustomer(Customer customer) {
		Customer c=customerRepo.save(customer);
		return c.getId();
	}

}
