<<<<<<< HEAD
package kr.co.shop.customer.repository;

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
		
		
		session.insert(NS+".insert", dto);
	}
}
=======
package kr.co.shop.customer.repository;

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
		
		
		session.insert(NS+".insert", dto);
	}
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
