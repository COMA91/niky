<<<<<<< HEAD
package kr.co.shop.product.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.product";
}
=======
package kr.co.shop.product.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.product";
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
