package kr.co.shop.manager.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.shop.manager.domain.ManagerDTO;
import kr.co.shop.manager.service.ManagerService;



@Controller
@RequestMapping("/manager")
public class ManagerController {

	@Inject
	private ManagerService mSerivce;
	
	
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