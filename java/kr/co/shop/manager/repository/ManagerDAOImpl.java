package kr.co.shop.manager.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAOImpl implements ManagerDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.manager";
}