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
import kr.co.shop.deletedmember.service.DeletedMemberService;
import kr.co.shop.order.domain.OrderDTO;
import kr.co.shop.order.service.OrderService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Inject
	private CustomerService cService;
	@Inject
	private DeletedMemberService dService;
	@Inject
	private OrderService oSerivce;
	
	@RequestMapping(value = {"/mypage","/mypage/{id}"}, method = RequestMethod.GET)
	public String myPage(@PathVariable("id") String id, Model model) {
		
		CustomerDTO cDto = cService.read(id);
		
		model.addAttribute("cDto", cDto);
		
		
		
		return "customer/myPage";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(@RequestParam Map<String, String> map) {
		

		int result = cService.delete(map);
		
		if (result > 0) {
			dService.insert(map);
			}
		
		return result+"";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id, Model model) {
		CustomerDTO dto = cService.read(id);
		model.addAttribute("dto", dto);
		
		return "customer/delete";
	}
	
	@RequestMapping(value = "/updatepw", method = RequestMethod.POST)
	@ResponseBody
	public String updatePw(@RequestParam Map<String, String> map) {
		int result = cService.updatePw(map);
		
		return result +"";
	}
	
	@RequestMapping(value = "/updatepw/{id}", method = RequestMethod.GET)
	public String updatePw(@PathVariable("id") String id, Model model) {
		
		CustomerDTO dto = cService.read(id);
		model.addAttribute("dto", dto);
		
		return "customer/updatePw";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String update(@RequestParam Map<String, String> map) {
		int result = cService.update(map);
		
		return result+"";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable("id") String id, Model model) {
		CustomerDTO dto = cService.read(id);
		model.addAttribute("dto", dto);
		
		return "customer/update";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout() {
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public void login(CustomerDTO login, Model model) {
		
		
		login = cService.login(login);
		
		model.addAttribute("login", login);
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "customer/login";
	}
	
	@RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
	public String read(@PathVariable("id") String id, Model model) {
		
		CustomerDTO dto = cService.read(id);
		model.addAttribute("dto", dto);
		
		return "customer/read";
	}
	
	@RequestMapping(value = "/idcheck", method = RequestMethod.POST)
	@ResponseBody
	public String idCheck(@RequestParam Map<String, Object> map) {
		int result = 0;
		CustomerDTO dto = cService.idCheck(map);
		if(dto==null) {
			result = 1;
		}

		return result+"";
	}
	
	@RequestMapping(value= "/insert", method = RequestMethod.POST)
	public String insert(CustomerDTO dto) {

		cService.insert(dto);
		
		return "/home";
		
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		
		return "/customer/insert";
	}
	

	
	
}
