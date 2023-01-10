<<<<<<< HEAD
package kr.co.shop.review.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDAOImpl implements ReviewDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.review";
}
=======
package kr.co.shop.review.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ReviewDAOImpl implements ReviewDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.review";
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
