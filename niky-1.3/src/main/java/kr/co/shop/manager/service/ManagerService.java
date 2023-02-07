package kr.co.shop.manager.service;

import java.util.Map;

import kr.co.shop.manager.domain.ManagerDTO;
import kr.co.shop.notice.domain.NoticeDTO;

public interface ManagerService {

	void insert(Map<String, String> map);

	ManagerDTO read(String id);

	int update(Map<String, String> map);

	int updatePw(Map<String, String> map);

	int delete(Map<String, String> map);

	ManagerDTO checkPw(Map<String, String> map);

}