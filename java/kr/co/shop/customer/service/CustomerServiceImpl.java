package kr.co.shop.customer.service;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.customer.domain.CustomerDTO;
import kr.co.shop.customer.repository.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Inject
	private CustomerDAO cDao;

	@Override
	public void insert(CustomerDTO dto) {
		cDao.insert(dto);
	
	}

	@Override
	public CustomerDTO idCheck(Map<String, Object> map) {
		String id = (String) map.get("id");
		
		CustomerDTO dto = cDao.read(id);
		
		
		return dto;
	}

	@Override
	public CustomerDTO read(String id) {
		CustomerDTO dto = cDao.read(id);
		
		return dto;
	}

	@Override
	public CustomerDTO login(CustomerDTO login) {
		
		login = cDao.login(login);

		return login;
	}

	@Override
	public int update(Map<String, String> map) {
		
		int result = cDao.update(map);
		
		return result;
	}

	@Override
	public int updatePw(Map<String, String> map) {
		int result = cDao.updatePw(map);
		
		return result;
	}
}
