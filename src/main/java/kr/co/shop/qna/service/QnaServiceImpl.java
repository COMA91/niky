package kr.co.shop.qna.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.notice.repository.NoticeDAO;

@Service
public class QnaServiceImpl implements QnaService{

	@Inject
	private NoticeDAO nDao;
}
