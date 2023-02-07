package kr.co.shop.product.repository;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
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
	public List<ProductDTO> list(Map<String, String> map, PageTO<ProductDTO> pt) {
		RowBounds rb = new RowBounds(pt.getStartNum(), pt.getPerpage());
		return session.selectList(NS+".list", map, rb);
	}

	@Override
	public int getAmount(Map<String, String> map) {
		Integer amount = session.selectOne(NS+".getAmount", map);
		
		if (amount == null) {
			amount = 0;
		}
		
		return amount;
	}

	@Override
	public void insert(ProductDTO dto) {
		session.insert(NS+".insert", dto);
	}
}