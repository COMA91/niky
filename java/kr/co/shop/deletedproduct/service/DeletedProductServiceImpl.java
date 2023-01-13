package kr.co.shop.deletedproduct.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.shop.deletedproduct.repository.DeletedProductDAO;

@Service
public class DeletedProductServiceImpl implements DeletedProductService{

	@Inject
	private DeletedProductDAO pmDao;
}
