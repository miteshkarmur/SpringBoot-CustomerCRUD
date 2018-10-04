package com.miteshkarmur.SpringBootCustomerCRUD.service;

import java.util.List;
import com.miteshkarmur.SpringBootCustomerCRUD.entity.Customer;

public interface CustomerService {
	
	List<Customer> listCustomers();

	Integer addCustomer(Customer customer);
}
