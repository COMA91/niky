package kr.co.shop.deletedmember.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.deletedmember.service.DeletedMemberService;



@Controller
@RequestMapping("/deletedmember")
public class DeletedMemberController {
	
	@Inject
	private DeletedMemberService dmSerivce;

}
