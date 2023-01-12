package kr.co.shop.customer.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value = "/updatepw", method = RequestMethod.POST)
	@ResponseBody
	public String updatePw(@RequestParam Map<String, String> map) {
		int result = cSerivce.updatePw(map);
		
		return result +"";
	}
	
	@RequestMapping(value = "/updatepw/{id}", method = RequestMethod.GET)
	public String updatePw(@PathVariable("id") String id, Model model) {
		
		CustomerDTO dto = cSerivce.read(id);
		model.addAttribute("dto", dto);
		
		return "customer/updatePw";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String update(@RequestParam Map<String, String> map) {
		int result = cSerivce.update(map);
		
		return result+"";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable("id") String id, Model model) {
		CustomerDTO dto = cSerivce.read(id);
		model.addAttribute("dto", dto);
		
		return "customer/update";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void login(CustomerDTO login, Model model) {
		
		
		login = cSerivce.login(login);
		
		model.addAttribute("login", login);
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "customer/login";
	}
	
	@RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
	public String read(@PathVariable("id") String id, Model model) {
		
		CustomerDTO dto = cSerivce.read(id);
		model.addAttribute("dto", dto);
		
		return "customer/read";
	}
	
	@RequestMapping(value = "/idcheck", method = RequestMethod.POST)
	@ResponseBody
	public String idCheck(@RequestParam Map<String, Object> map) {
		int result = 0;
		CustomerDTO dto = cSerivce.idCheck(map);
		if(dto==null) {
			result = 1;
		}

		return result+"";
	}
	
	@RequestMapping(value= "/insert", method = RequestMethod.POST)
	public String insert(CustomerDTO dto) {

		cSerivce.insert(dto);
		
		return "/";
		
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		
		return "/customer/insert";
	}
	

	
	
}
