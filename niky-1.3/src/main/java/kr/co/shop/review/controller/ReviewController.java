package kr.co.shop.review.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.shop.review.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {
	
	@Inject
	private ReviewService rSerivce;

}