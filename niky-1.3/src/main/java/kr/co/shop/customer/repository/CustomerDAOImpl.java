package kr.co.shop.customer.repository;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.shop.common.domain.PageTO;
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

	@Override
	public int delete(Map<String, String> map) {
		
		
		return session.delete(NS+".delete", map);
	}

	@Override
	public CustomerDTO idCheck(String id) {
		
		return session.selectOne(NS+".idCheck", id);
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
	public List<CustomerDTO> list(Map<String, String> map, PageTO<CustomerDTO> pt) {
		RowBounds rb = new RowBounds(pt.getStartNum(), pt.getPerpage());
		return session.selectList(NS+".list", map, rb);
	}

	@Override
	public CustomerDTO checkPw(Map<String, String> map) {
		
		return session.selectOne(NS+".checkPw", map);
	}
}