package kr.co.shop.qna.repository;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.qna.domain.QnaDTO;

@Repository
public class QnaDAOImpl implements QnaDAO{

	@Inject
	private SqlSession session;
	private final String NS = "kr.co.shop.qna";
	
	
	@Override
	public QnaDTO read(int bno) {
		
		return session.selectOne(NS+".read", bno);
	}

	




	@Override
	public int getAmount(Map<String, String> map) {
		Integer amount = session.selectOne(NS+".getAmount", map);
		if (amount == null) {
			amount = 0;
		}
		

		
		
		return amount;
	}


	@Override
	public List<QnaDTO> list(Map<String, String> map, PageTO<QnaDTO> pt) {
		
		RowBounds rb = new RowBounds(pt.getStartNum(), pt.getPerpage());
		
		return session.selectList(NS+".list", map, rb);
	}



	@Override
	public int insert(Map<String, String> map) {
		int result = session.insert(NS+".insert", map);
		return result;
	}






	@Override
	public void list(Map<String, String> map) {
		// TODO Auto-generated method stub
		
	}
}
