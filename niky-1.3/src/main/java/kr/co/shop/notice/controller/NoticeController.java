package kr.co.shop.notice.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.manager.domain.ManagerDTO;
import kr.co.shop.manager.service.ManagerService;
import kr.co.shop.notice.domain.NoticeDTO;
import kr.co.shop.notice.service.NoticeService;



@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@Inject
	private NoticeService nSerivce;

	@Inject
	private ManagerService mService;
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(@RequestParam Map<String, String> map) {
		
		int result = nSerivce.delete(map);
		return result+"";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String update(@RequestParam Map<String, String> map) {
		int result = 0;
		ManagerDTO dto = mService.checkPw(map);
		
		if (dto != null) {
			result = nSerivce.update(map);	
		}
		
		return result+"";
	}
	
	@RequestMapping(value = "/update/{bno}", method = RequestMethod.GET)
	public String update(@PathVariable("bno") Integer bno, Model model) {
		
		NoticeDTO dto = nSerivce.read(bno);
		model.addAttribute("dto", dto);
		
		return "notice/update";
	}
	
	@RequestMapping(value = {"/read/{bno}/{curpage}/{criteria}/{keyword}", 
			"/read/{bno}/{curpage}",
			"/read/{bno}"}, method = RequestMethod.GET)
	public String read(@PathVariable Map<String, String> map, Model model) {
		String sbno = map.get("bno");
		int bno = -1;
		
		if (sbno != null) {
			bno = Integer.parseInt(sbno);
		}
		
		NoticeDTO dto = nSerivce.read(bno);

		model.addAttribute("dto", dto);
		
		String scurpage = map.get("curpage");
		int curpage = -1;
		
		if (scurpage != null) {
			curpage = Integer.parseInt(scurpage);
		}
		
		model.addAttribute("curpage", curpage);
			
		String criteria = map.get("criteria");
		String keyword = map.get("keyword");
		
		if (keyword == null || keyword == "") {
			keyword = null;
		}
		
		model.addAttribute("criteria", criteria);
		model.addAttribute("keyword", keyword);
		
		
		return "notice/read";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST )
	@ResponseBody
	public String insert(@RequestParam Map<String, String> map) {
		int result = 0;

		ManagerDTO mDto = mService.checkPw(map);
		
		if (mDto != null) {
			result = 1;
			NoticeDTO dto= new NoticeDTO(map.get("id"), map.get("criteria"), map.get("title"), map.get("content"));
			nSerivce.insert(dto);
		
		}
		
		
		
		return result+"";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		return "notice/insert";
	}
	
	@RequestMapping(value = {"/list", "/list/{curpage}", 
			"/list/{curpage}/{category}/{keyword}",
			"/list/{criteria}/{keyword}"}, method = RequestMethod.GET)
	public String list(@PathVariable Map<String, String> map, Model model) {
		
		PageTO<NoticeDTO> pt = nSerivce.list(map);
		model.addAttribute("list", pt.getList());
		model.addAttribute("pt", pt);

		return "notice/list";
	}
}
