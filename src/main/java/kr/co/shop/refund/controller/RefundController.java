package kr.co.shop.refund.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.refund.service.RefundService;



@Controller
@RequestMapping("/refund")
public class RefundController {
	
	@Inject
	private RefundService rfSerivce;

}
