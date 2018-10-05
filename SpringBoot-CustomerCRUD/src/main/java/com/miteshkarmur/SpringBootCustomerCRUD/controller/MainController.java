package com.miteshkarmur.SpringBootCustomerCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miteshkarmur.SpringBootCustomerCRUD.entity.Customer;
import com.miteshkarmur.SpringBootCustomerCRUD.service.CustomerService;


@Controller
//@RequestMapping("/")
public class MainController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/")
	public String addCustomers(Model model) {
		customerService.saveOrUpdateCustomer(new Customer("Mitesh", "Keshur", "mk@gmail.com"));
		customerService.saveOrUpdateCustomer(new Customer("Subhash", "Keshur", "sk@gmail.com"));
		customerService.saveOrUpdateCustomer(new Customer("Payal", "Keshur", "pk@gmail.com"));
		return "index";
	}
	@GetMapping("/listCustomers")
	public String listCustomers(Model model) {
		List<Customer> custList=customerService.getAllCustomers();
		model.addAttribute("customers",custList);
		return "list-customers";
	}
	
}
