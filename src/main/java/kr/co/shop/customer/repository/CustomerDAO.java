package kr.co.shop.customer.repository;

import kr.co.shop.customer.domain.CustomerDTO;

public interface CustomerDAO {

	void insert(CustomerDTO dto);

	CustomerDTO read(String id);

	CustomerDTO login(CustomerDTO login);


}