package kr.co.shop.product.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.product.service.ProductService;



@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Inject
	private ProductService pSerivce;

}