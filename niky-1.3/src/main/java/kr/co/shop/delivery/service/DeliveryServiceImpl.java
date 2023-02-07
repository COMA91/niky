package kr.co.shop.delivery.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.delivery.repository.DeliveryDAO;

@Service
public class DeliveryServiceImpl implements DeliveryService{

	@Inject
	private DeliveryDAO dDAO;
	
}