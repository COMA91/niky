package kr.co.shop.customer.service;

import java.util.List;
import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.customer.domain.CustomerDTO;

public interface CustomerService {

	void insert(CustomerDTO dto);

	CustomerDTO idCheck(Map<String, Object> map);

	CustomerDTO read(String id);

	CustomerDTO login(CustomerDTO login);

	int update(Map<String, String> map);

	int updatePw(Map<String, String> map);

	int delete(Map<String, String> map);

	PageTO<CustomerDTO> list(Map<String, String> map);

	CustomerDTO checkPw(Map<String, String> map);

}