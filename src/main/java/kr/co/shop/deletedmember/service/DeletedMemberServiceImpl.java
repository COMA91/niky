package kr.co.shop.deletedmember.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.deletedmember.repository.DeletedMemberDAO;

@Service
public class DeletedMemberServiceImpl implements DeletedMemberService{

	@Inject
	private DeletedMemberDAO dmDao;
}
