package kr.co.shop.manager.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.manager.repository.ManagerDAO;

@Service
public class ManagerServiceImpl implements ManagerService{

	@Inject
	private ManagerDAO mDao;
}