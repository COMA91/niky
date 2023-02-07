package kr.co.shop.customer.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.customer.domain.CustomerDTO;
import kr.co.shop.customer.repository.CustomerDAO;
import kr.co.shop.product.domain.ProductDTO;

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
		
		CustomerDTO dto = cDao.idCheck(id);
		
		
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

	@Override
	public int delete(Map<String, String> map) {
		int result = cDao.delete(map);
		

		return result;
	}

	@Override
	public PageTO<CustomerDTO> list(Map<String, String> map) {
		int curpage = 1;
		String scurpage = map.get("curpage");
		
		if (scurpage != null) {
			curpage = Integer.parseInt(scurpage);
		}
		
		int amount = cDao.getAmount(map);
		
		PageTO<CustomerDTO> pt = new PageTO<CustomerDTO>(curpage, amount, map.get("category"), map.get("keyword"));
		List<CustomerDTO> list = cDao.list(map, pt);
		pt.setList(list);
		
		return pt;
	}

	@Override
	public CustomerDTO checkPw(Map<String, String> map) {
		CustomerDTO dto = cDao.checkPw(map);
		return dto;
	}



	


}
