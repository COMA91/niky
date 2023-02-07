package kr.co.shop.qna.repository;

import java.util.List;
import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.qna.domain.QnaDTO;

public interface QnaDAO {

	QnaDTO read(int bno);

	int insert(Map<String, String> map);

	void list(Map<String, String> map);

	int getAmount(Map<String, String> map);

	List<QnaDTO> list(Map<String, String> map, PageTO<QnaDTO> pt);

}
