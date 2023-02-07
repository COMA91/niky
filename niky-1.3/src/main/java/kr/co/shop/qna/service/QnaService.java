package kr.co.shop.qna.service;

import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.qna.domain.QnaDTO;

public interface QnaService {

	QnaDTO read(int bno);

	int insert(Map<String, String> map);

	PageTO<QnaDTO> list(String id);

	PageTO<QnaDTO> list(Map<String, String> map);

}
