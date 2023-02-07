package kr.co.shop.deletedproduct.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class DeletedProductDAOImpl implements DeletedProductDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.deletedproduct";
}
