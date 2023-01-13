package kr.co.shop.manager.service;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.manager.repository.ManagerDAO;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Inject
	private ManagerDAO mDao;

	@Override
	public void insert(Map<String, String> map) {
		mDao.insert(map);
	}
}