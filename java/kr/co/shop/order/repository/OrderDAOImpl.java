package kr.co.shop.order.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.shop.order.domain.OrderDTO;

@Repository
public class OrderDAOImpl implements OrderDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.order";

}