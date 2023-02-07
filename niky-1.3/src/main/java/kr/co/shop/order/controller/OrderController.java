package kr.co.shop.order.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.order.service.OrderService;



@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Inject
	private OrderService oSerivce;

}