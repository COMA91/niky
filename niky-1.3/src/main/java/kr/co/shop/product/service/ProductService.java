
package kr.co.shop.product.service;

import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.product.domain.ProductDTO;

public interface ProductService {

	PageTO<ProductDTO> list(Map<String, String> map);

	void insert(ProductDTO dto);

}

