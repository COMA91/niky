package kr.co.shop.customer.repository;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.shop.customer.domain.CustomerDTO;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.customer";
	
	@Override
	public void insert(CustomerDTO dto) {
		
		char sex = dto.getSex();
		
		if (sex == '1' || sex == '3') {
			sex = 'm';
		}else {
			sex = 'w';
		}
		
		dto.setSex(sex);
		
		session.insert(NS+".insert", dto);
	}

	@Override
	public CustomerDTO read(String id) {
		
		
		return session.selectOne(NS+".read", id);
	}

	@Override
	public CustomerDTO login(CustomerDTO login) {
		
		return session.selectOne(NS+".login", login);
	}

	@Override
	public int update(Map<String, String> map) {
		
		
		
		return session.update(NS+".update", map);
	}

	@Override
	public int updatePw(Map<String, String> map) {
		
		return session.update(NS+".updatePw", map);
	}
}