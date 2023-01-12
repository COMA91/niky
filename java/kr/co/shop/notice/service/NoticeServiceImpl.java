package kr.co.shop.notice.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.notice.repository.NoticeDAO;

@Service
public class NoticeServiceImpl implements NoticeService{

	@Inject
	private NoticeDAO nDao;
}
