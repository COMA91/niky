package kr.co.shop.refund.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.refund.repository.RefundDAO;

@Service
public class RefundServiceImpl implements RefundService{

	@Inject
	private RefundDAO rfDao;
}
