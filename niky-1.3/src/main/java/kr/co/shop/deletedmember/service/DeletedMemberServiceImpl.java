package kr.co.shop.deletedmember.service;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.deletedmember.repository.DeletedMemberDAO;

@Service
public class DeletedMemberServiceImpl implements DeletedMemberService{

	@Inject
	private DeletedMemberDAO dmDao;

	@Override
	public void insert(Map<String, String> map) {
		dmDao.insert(map);
	
	}
}
