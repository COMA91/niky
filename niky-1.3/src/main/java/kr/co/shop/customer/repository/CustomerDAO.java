package kr.co.shop.customer.repository;

import java.util.List;
import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.customer.domain.CustomerDTO;

public interface CustomerDAO {

	void insert(CustomerDTO dto);

	CustomerDTO read(String id);

	CustomerDTO login(CustomerDTO login);

	int update(Map<String, String> map);

	int updatePw(Map<String, String> map);

	int delete(Map<String, String> map);

	CustomerDTO idCheck(String id);

	int getAmount(Map<String, String> map);

	List<CustomerDTO> list(Map<String, String> map, PageTO<CustomerDTO> pt);

	CustomerDTO checkPw(Map<String, String> map);



}