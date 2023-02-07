package kr.co.shop.notice.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.notice.domain.NoticeDTO;
import kr.co.shop.notice.repository.NoticeDAO;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Inject
	private NoticeDAO nDao;

	@Override
	public PageTO<NoticeDTO> list(Map<String, String> map) {
		int curpage = 1;
		String scurpage = map.get("curpage");
		if (scurpage != null) {
			curpage = Integer.parseInt(scurpage);
		}
		
		int amount = nDao.getAmount(map);
		
		PageTO<NoticeDTO> pt = new PageTO<NoticeDTO>(curpage, amount, map.get("criteria"), map.get("keyword"));
		List<NoticeDTO> list = nDao.list(map,pt);
		pt.setList(list);
		
		return pt;
	}

	@Override
	public void insert(NoticeDTO dto) {
		
		nDao.insert(dto);
		
	}

	@Override
	public NoticeDTO read(Integer bno) {
		NoticeDTO dto = nDao.read(bno);
		
		return dto;
	}

	@Override
	public int update(Map<String, String> map) {
		int result = nDao.update(map);
		
		return result;
	}

	@Override
	public int delete(Map<String, String> map) {
		int result = nDao.delete(map);
		return result;
	}
}
