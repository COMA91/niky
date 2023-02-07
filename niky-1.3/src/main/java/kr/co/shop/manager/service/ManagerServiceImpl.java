package kr.co.shop.manager.service;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.manager.domain.ManagerDTO;
import kr.co.shop.manager.repository.ManagerDAO;
import kr.co.shop.notice.domain.NoticeDTO;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Inject
	private ManagerDAO mDao;

	@Override
	public void insert(Map<String, String> map) {
		mDao.insert(map);
	}

	@Override
	public ManagerDTO read(String id) {
		ManagerDTO mDto = mDao.read(id);
		
		return mDto;
	}

	@Override
	public int update(Map<String, String> map) {
		int result = mDao.update(map);
		
		return result;
	}

	@Override
	public int updatePw(Map<String, String> map) {
		int result = mDao.updatePw(map);
		
		return result;
	}

	@Override
	public int delete(Map<String, String> map) {
		int result = mDao.delete(map);
		
		return result;
	}

	@Override
	public ManagerDTO checkPw(Map<String, String> map) {
		
		return mDao.checkPw(map);
	}
}