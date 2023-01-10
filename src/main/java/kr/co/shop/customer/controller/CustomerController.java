package kr.co.shop.customer.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
	
	@RequestMapping(value = "/idcheck", method = RequestMethod.POST)
	@ResponseBody
	public String idCheck(@RequestParam Map<String, Object> map) {
		int result = 0;
		
		CustomerDTO dto = cSerivce.idCheck(map);
		
		if (dto==null) {
			result = 1;
		}
		
		return result+"";
	}
	
	
}
