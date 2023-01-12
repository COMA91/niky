package kr.co.shop.customer.repository;

import java.util.Map;

import kr.co.shop.customer.domain.CustomerDTO;

public interface CustomerDAO {

	void insert(CustomerDTO dto);

	CustomerDTO read(String id);

	CustomerDTO login(CustomerDTO login);

	int update(Map<String, String> map);

	int updatePw(Map<String, String> map);

	int delete(Map<String, String> map);



}