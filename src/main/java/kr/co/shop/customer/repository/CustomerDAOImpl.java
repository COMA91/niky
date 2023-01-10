package kr.co.shop.customer.repository;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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
		
		String cbirth = dto.getBirth();
		cbirth = cbirth.substring(0, 4);
		int birth = Integer.parseInt(cbirth);
		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		
		int age = year-birth;
		
		dto.setAge(age);
		
		session.insert(NS+".insert", dto);
	}

	@Override
	public CustomerDTO read(String id) {
		
		
		return session.selectOne(NS+".read", id);
	}
}
