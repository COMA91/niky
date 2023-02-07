package kr.co.shop.qna.controller;

import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.customer.domain.CustomerDTO;
import kr.co.shop.customer.service.CustomerService;
import kr.co.shop.qna.domain.QnaDTO;
import kr.co.shop.qna.service.QnaService;



@Controller
@RequestMapping("/qna")
public class QnaController {
	
	@Inject
	private QnaService qSerivce;
	
	@Inject
	private CustomerService cService;
	
	@Inject
	private ServletContext sc;
	
	
	@RequestMapping(value = { "/read/{bno}/{curpage}/{criteria}/{keyword}", "/read/{bno}",
	"/read/{bno}/{curpage}" }, method = RequestMethod.GET)
	@ResponseBody
	public String read(@PathVariable Map<String, String> map, Model model) {
		
		String qbno = map.get("bno");
		int bno = -1;
		if (qbno != null) {
			bno = Integer.parseInt(qbno);
		}
		
		QnaDTO dto = qSerivce.read(bno);
		
		String scurpage = map.get("curpage");
		int curpage = 1;
		if (scurpage != null) {
			curpage = Integer.parseInt(scurpage);
		}
		
		String criteria = map.get("criteria");
		String keyword = map.get("keyword");
		
		model.addAttribute("dto",dto);
		model.addAttribute("curpage", curpage);
		model.addAttribute("criteria", criteria);
		model.addAttribute("keyword", keyword);
		
		
		return "/qna/read";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public String insert(@RequestParam Map<String, String> map) {
		int result = 0;
		CustomerDTO dto = cService.checkPw(map);
				
		if (dto != null) {
			result = 1;
			qSerivce.insert(map);
		}
		
		
		
		return result+"";
	}
	
	@RequestMapping(value = {"/insert/{id}"}, method = RequestMethod.GET)
	public String insert() {
		
		return "/qna/insert";
	}
	
	
	@RequestMapping(value = {"/list" ,"/list/{id}", "/list/{id}/{curpage}"}, method = RequestMethod.GET)
	public String list(@PathVariable Map<String, String> map, Model model) {
		
		PageTO<QnaDTO> pt = qSerivce.list(map);
		model.addAttribute("list", pt.getList());
		model.addAttribute("pt", pt);
		
		return "/qna/list";
	}

}
