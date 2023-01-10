<<<<<<< HEAD
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
=======
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
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
