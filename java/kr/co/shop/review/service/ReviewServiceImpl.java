package kr.co.shop.review.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.review.repository.ReviewDAO;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Inject
	private ReviewDAO rDao;
}
