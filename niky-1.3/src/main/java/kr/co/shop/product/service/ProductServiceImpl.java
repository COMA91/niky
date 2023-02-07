package kr.co.shop.product.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.product.domain.ProductDTO;
import kr.co.shop.product.repository.ProductDAO;
import kr.co.shop.product.repository.UploadDAO;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDAO pDao;

	@Autowired(required = false)
	private UploadDAO uDao;
	
	@Override
	public PageTO<ProductDTO> list(Map<String, String> map) {
		int curpage = 1;
		String scurpage = map.get("curpage");
		
		if (scurpage != null) {
			curpage = Integer.parseInt(scurpage);
		}
		
		int amount = pDao.getAmount(map);
		
		String sminprice = map.get("minprice");
		int minprice = Integer.parseInt(sminprice);
		
		String smaxprice = map.get("maxprice");
		int maxprice = Integer.parseInt(smaxprice);
		
		PageTO<ProductDTO> pt = new PageTO<ProductDTO>(curpage, amount, map.get("category"), map.get("sex"), minprice, maxprice, map.get("keyword"));
		List<ProductDTO> list = pDao.list(map, pt);
		pt.setList(list);
		
		return pt;
	}

	@Override
	public void insert(ProductDTO dto) {
		pDao.insert(dto);
		List<String> list = dto.getUploadedFileList();
		
		for (int i = 0; i < list.size(); i++) {
			String uploadedFilename = list.get(i);
			Map<String, Object> map = new HashMap<String, Object>();
			map.putIfAbsent("uploadedFilename", uploadedFilename);
			map.putIfAbsent("pronum", dto.getPronum());
			uDao.insert(map);
		}
	}
}