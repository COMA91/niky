package kr.co.shop.manager.repository;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.shop.manager.domain.ManagerDTO;

@Repository
public class ManagerDAOImpl implements ManagerDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.manager";
	@Override
	public void insert(Map<String, String> map) {
	
		session.insert(NS+".insert", map);
	}
	@Override
	public ManagerDTO read(String id) {
		
		return session.selectOne(NS+".read", id);
	}
	@Override
	public int update(Map<String, String> map) {
		
		return session.update(NS+".update", map);
	}
	
	@Override
	public int updatePw(Map<String, String> map) {
		
		return session.update(NS+".updatePw", map);
	}
	@Override
	public int delete(Map<String, String> map) {
		
		return session.delete(NS+".delete", map);
	}
	@Override
	public ManagerDTO checkPw(Map<String, String> map) {
		
		return session.selectOne(NS+".checkPw", map);
	}
}