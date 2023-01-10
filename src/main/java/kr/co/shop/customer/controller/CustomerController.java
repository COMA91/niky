<<<<<<< HEAD
package kr.co.shop.customer.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.shop.customer.domain.CustomerDTO;
import kr.co.shop.customer.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Inject
	private CustomerService cSerivce;
	

	@RequestMapping(value= "/insert", method = RequestMethod.POST)
	public String insert(CustomerDTO dto) {
		
		cSerivce.insert(dto);
		
		return "home";
		
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		
		return "/customer/insert";
	}
	
	
}
=======
package kr.co.shop.customer.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.shop.customer.domain.CustomerDTO;
import kr.co.shop.customer.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Inject
	private CustomerService cSerivce;
	

	@RequestMapping(value= "/insert", method = RequestMethod.POST)
	public String insert(CustomerDTO dto) {
		
		cSerivce.insert(dto);
		
		return "home";
		
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		
		return "/customer/insert";
	}
	
	
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
