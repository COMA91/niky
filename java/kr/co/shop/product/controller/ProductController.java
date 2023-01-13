package kr.co.shop.product.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.product.domain.ProductDTO;
import kr.co.shop.product.service.ProductService;



@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Inject
	private ProductService pSerivce;

	@RequestMapping(value = {"/list", "/list/{category}","/list/{curpage}", 
			"/list/{curpage}/{minprice}/{maxprice}/{category}/{keyword}", 
			"/list/{minprice}/{maxprice}/{category}/{keyword}",
			"/list/{curpage}/{category}/{keyword}"}, 
			method = RequestMethod.POST)
	public String list(@PathVariable Map<String, Object> map, Model model) {
		List<ProductDTO> dto = pSerivce.list();
		model.addAttribute("dto", dto);
		
		return "product/list";
	}
}
