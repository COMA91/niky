<<<<<<< HEAD
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
=======
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
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
