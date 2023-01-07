package kr.co.shop.seller.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.seller.service.SellerService;



@Controller
@RequestMapping("/seller")
public class SellerController {

	@Inject
	private SellerService sSerivce;
	
}
