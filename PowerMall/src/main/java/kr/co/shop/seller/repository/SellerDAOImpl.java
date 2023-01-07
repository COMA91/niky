package kr.co.shop.seller.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class SellerDAOImpl implements SellerDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.seller";
}
