package kr.co.shop.notice.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.notice.service.NoticeService;



@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Inject
	private NoticeService nSerivce;

}
