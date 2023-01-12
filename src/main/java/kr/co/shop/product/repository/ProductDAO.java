package kr.co.shop.product.repository;

import java.util.List;
import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.product.domain.ProductDTO;

public interface ProductDAO {

	List<ProductDTO> list();

}