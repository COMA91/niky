package kr.co.shop.reply.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.notice.repository.NoticeDAO;

@Service
public class ReplyServiceImpl implements ReplyService{

	@Inject
	private NoticeDAO nDao;
}
