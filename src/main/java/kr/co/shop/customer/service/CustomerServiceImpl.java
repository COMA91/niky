package kr.co.shop.customer.service;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.customer.domain.CustomerDTO;
import kr.co.shop.customer.repository.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Inject
	private CustomerDAO cDAO;

	@Override
	public void insert(CustomerDTO dto) {
		cDAO.insert(dto);
	
	}

	@Override
	public CustomerDTO idCheck(Map<String, Object> map) {
		String id = (String) map.get("id");
		
		CustomerDTO dto = cDAO.read(id);
		
		return dto;
	}

	@Override
	public CustomerDTO read(String id) {
		CustomerDTO dto = cDAO.read(id);
		
		return dto;
	}
}
