<<<<<<< HEAD
package kr.co.shop.order.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl implements OrderDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.order";
}
=======
package kr.co.shop.order.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDAOImpl implements OrderDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.order";
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
