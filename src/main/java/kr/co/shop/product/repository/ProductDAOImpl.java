package kr.co.shop.product.repository;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.product.domain.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.product";
	
	@Override
	public List<ProductDTO> list() {
		return session.selectList(NS+".list");
	}
}