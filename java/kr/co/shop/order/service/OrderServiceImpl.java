package kr.co.shop.order.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.order.domain.OrderDTO;
import kr.co.shop.order.repository.OrderDAO;

@Service
public class OrderServiceImpl implements OrderService{

	@Inject
	private OrderDAO oDao;


}