package kr.co.shop.notice.repository;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.notice.domain.NoticeDTO;

@Repository
public class NoticeDAOImpl implements NoticeDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.notice";
	@Override
	public int getAmount(Map<String, String> map) {
		Integer amount = session.selectOne(NS+".getAmount", map);
		
		if (amount == null) {
			amount = 0;
		}
		
		return amount;
	}
	@Override
	public List<NoticeDTO> list(Map<String, String> map, PageTO<NoticeDTO> pt) {
		RowBounds rb = new RowBounds(pt.getStartNum(), pt.getPerpage());
		return session.selectList(NS+".list", map, rb);
	}
	@Override
	public void insert(NoticeDTO dto) {
		
		session.insert(NS+".insert", dto);
		
	}
	@Override
	public NoticeDTO read(Integer bno) {
		
		return session.selectOne(NS+".read", bno);
	}
	@Override
	public int update(Map<String, String> map) {
		
		return session.update(NS+".update", map);
	}
	@Override
	public int delete(Map<String, String> map) {
		
		return session.delete(NS+".delete", map);
	}
}
