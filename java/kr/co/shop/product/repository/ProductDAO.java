package kr.co.shop.product.repository;

import java.util.List;

import kr.co.shop.product.domain.ProductDTO;

public interface ProductDAO {

	List<ProductDTO> list();

}