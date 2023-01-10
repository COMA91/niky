<<<<<<< HEAD
package kr.co.shop.manager.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAOImpl implements ManagerDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.manager";
}
=======
package kr.co.shop.manager.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ManagerDAOImpl implements ManagerDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.manager";
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
