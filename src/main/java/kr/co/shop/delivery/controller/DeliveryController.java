package kr.co.shop.delivery.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.delivery.service.DeliveryService;

@Controller
@RequestMapping("/delivery")
public class DeliveryController {

	@Inject
	private DeliveryService dSerivce;
	
}
