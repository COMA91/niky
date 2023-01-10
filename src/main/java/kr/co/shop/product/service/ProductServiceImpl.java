package kr.co.shop.product.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.product.repository.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Inject
	private ProductDAO pDao;
}
