package kr.co.shop.manager.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.manager.service.ManagerService;



@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Inject
	private ManagerService mSerivce;
}