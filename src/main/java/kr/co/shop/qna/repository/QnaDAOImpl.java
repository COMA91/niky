package kr.co.shop.qna.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDAOImpl implements QnaDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.notice";
}
