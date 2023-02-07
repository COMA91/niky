package kr.co.shop.notice.service;

import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.notice.domain.NoticeDTO;

public interface NoticeService {

	PageTO<NoticeDTO> list(Map<String, String> map);

	void insert(NoticeDTO dto);

	NoticeDTO read(Integer bno);

	int update(Map<String, String> map);

	int delete(Map<String, String> map);



}
