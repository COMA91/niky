package kr.co.shop.deletedproduct.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.deletedproduct.service.DeletedProductService;



@Controller
@RequestMapping("/deletedproduct")
public class DeletedProductController {
	
	@Inject
	private DeletedProductService pmSerivce;

}
