package kr.co.shop.deletedmember.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class DeletedMemberDAOImpl implements DeletedMemberDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.deletedmember";
}
