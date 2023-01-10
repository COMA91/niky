package kr.co.shop.refund.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class RefundDAOImpl implements RefundDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.refund";
}
