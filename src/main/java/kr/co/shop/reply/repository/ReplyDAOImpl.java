package kr.co.shop.reply.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyDAOImpl implements ReplyDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.notice";
}
