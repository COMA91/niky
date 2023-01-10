package kr.co.shop.customer.service;

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
}
