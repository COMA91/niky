package kr.co.shop.manager.controller;

import java.util.Map;

import javax.inject.Inject;

import org.imgscalr.Scalr.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.shop.deletedmember.service.DeletedMemberService;
import kr.co.shop.manager.domain.ManagerDTO;
import kr.co.shop.manager.service.ManagerService;



@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Inject
	private ManagerService mSerivce;
	
	@Inject
	private DeletedMemberService dService;
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	@ResponseBody
	public String delete(@RequestParam Map<String, String> map) {
		int result = mSerivce.delete(map);
		
		if (result > 0) {
			dService.insert(map);
		}
		
		return result+"";
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") String id, Model model) {
		ManagerDTO mDto = mSerivce.read(id);
		model.addAttribute("mDto", mDto);
		
		return "manager/delete";
	}
	
	@RequestMapping(value = "/updatepw", method = RequestMethod.POST)
	@ResponseBody
	public String updatePw(@RequestParam Map<String, String> map) {
		
		int result = mSerivce.updatePw(map);
		
		return result+"";
	}
	
	@RequestMapping(value = "/updatepw/{id}", method = RequestMethod.GET)
	public String updatePw(@PathVariable("id") String id, Model model) {
		
		ManagerDTO mDto = mSerivce.read(id);
		model.addAttribute("mDto", mDto);
		
		return "manager/updatePw";
	}
	
	@RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
	public String read(@PathVariable("id") String id, Model model) {
		ManagerDTO mDto = mSerivce.read(id);
		
		model.addAttribute("mDto", mDto);
		
		return "manager/read";
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	@ResponseBody
	public String update(@RequestParam Map<String, String> map) {
		int result = mSerivce.update(map);
		
		return result + "";
	}
	
	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public String update(@PathVariable("id") String id, Model model) {
		ManagerDTO mDto = mSerivce.read(id);
		
		model.addAttribute("mDto", mDto);
		
		return "manager/update";
	}
	
	@RequestMapping(value = "/mypage/{id}", method = RequestMethod.GET)
	public String myPage(@PathVariable("id") String id, Model model) {
		
		ManagerDTO mDto = mSerivce.read(id);
		
		model.addAttribute("mDto", mDto);
		
		return "manager/myPage";
		
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public String insert(@RequestParam Map<String, String> map) {
		int result = 0;
		ManagerDTO dto = new ManagerDTO();
		String secretcode = dto.getSecretcode();
		String input_secertcode = map.get("secretcode");

		if (secretcode.equals(input_secertcode)) {
			result = 1;
			mSerivce.insert(map);
		}
		
		return result + "";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		return "manager/insert";
	}
	
}