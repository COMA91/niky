package kr.co.shop.deletedmember.repository;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.shop.deletedmember.domain.DeletedMemberDTO;

@Repository
public class DeletedMemberDAOImpl implements DeletedMemberDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.deletedmember";
	@Override
	public void insert(Map<String, String> map) {
		
	
		session.insert(NS+".insert", map);
	}
}
