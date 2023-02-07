package kr.co.shop.qna.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.product.domain.ProductDTO;
import kr.co.shop.qna.domain.QnaDTO;
import kr.co.shop.qna.repository.QnaDAO;

@Service
public class QnaServiceImpl implements QnaService{

	@Inject
	private QnaDAO qDao;

	@Override
	public QnaDTO read(int bno) {
		QnaDTO dto = qDao.read(bno);
		return dto;
	}





	@Override
	public PageTO<QnaDTO> list(Map<String, String> map) {
		
		
		
		int curpage = 1;
		String scurpage = map.get("curpage");
		
		if (scurpage != null) {
			curpage = Integer.parseInt(scurpage);
		}
		
		int amount = qDao.getAmount(map);
		
		
		PageTO<QnaDTO> pt = new PageTO<QnaDTO>(curpage, amount,  map.get("keyword"));
		List<QnaDTO> list = qDao.list(map, pt);
		pt.setList(list);
		
		return pt;
	}


	@Override
	public PageTO<QnaDTO> list(String id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int insert(Map<String, String> map) {
		int result = qDao.insert(map);
		
		return result;
	}
}
