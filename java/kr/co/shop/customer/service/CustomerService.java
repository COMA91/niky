package kr.co.shop.customer.service;

import java.util.Map;

import kr.co.shop.customer.domain.CustomerDTO;

public interface CustomerService {

	void insert(CustomerDTO dto);

	CustomerDTO idCheck(Map<String, Object> map);

	CustomerDTO read(String id);

	CustomerDTO login(CustomerDTO login);

	int update(Map<String, String> map);

	int updatePw(Map<String, String> map);

	int delete(Map<String, String> map);

}