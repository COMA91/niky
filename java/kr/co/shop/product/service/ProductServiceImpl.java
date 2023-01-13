package kr.co.shop.product.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.product.domain.ProductDTO;
import kr.co.shop.product.repository.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Inject
	private ProductDAO pDao;

	@Override
	public List<ProductDTO> list() {
		List<ProductDTO> list = pDao.list();
		return list;
	}
}