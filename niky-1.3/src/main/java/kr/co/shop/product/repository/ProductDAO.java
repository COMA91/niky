package kr.co.shop.product.repository;

import java.util.List;
import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.product.domain.ProductDTO;

public interface ProductDAO {

	List<ProductDTO> list(Map<String, String> map, PageTO<ProductDTO> pt);

	int getAmount(Map<String, String> map);

	void insert(ProductDTO dto);

}