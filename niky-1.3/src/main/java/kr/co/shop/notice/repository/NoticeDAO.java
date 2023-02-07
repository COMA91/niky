package kr.co.shop.notice.repository;

import java.util.List;
import java.util.Map;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.notice.domain.NoticeDTO;

public interface NoticeDAO {

	int getAmount(Map<String, String> map);

	List<NoticeDTO> list(Map<String, String> map, PageTO<NoticeDTO> pt);

	void insert(NoticeDTO dto);

	NoticeDTO read(Integer bno);

	int update(Map<String, String> map);

	int delete(Map<String, String> map);

}
