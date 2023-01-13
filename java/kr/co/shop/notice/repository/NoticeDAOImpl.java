package kr.co.shop.notice.repository;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAOImpl implements NoticeDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.notice";
}
