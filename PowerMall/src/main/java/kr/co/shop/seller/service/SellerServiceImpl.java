package kr.co.shop.seller.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.seller.repository.SellerDAO;

@Service
public class SellerServiceImpl implements SellerService{

	@Inject
	private SellerDAO sDao;
}
