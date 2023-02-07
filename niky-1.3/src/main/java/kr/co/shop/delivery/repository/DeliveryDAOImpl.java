package kr.co.shop.delivery.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class DeliveryDAOImpl implements DeliveryDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.delivery";
	
}