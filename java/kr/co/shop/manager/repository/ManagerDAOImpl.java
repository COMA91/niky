package kr.co.shop.manager.repository;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAOImpl implements ManagerDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.manager";
	@Override
	public void insert(Map<String, String> map) {
	
		session.insert(NS+".insert", map);
	}
}