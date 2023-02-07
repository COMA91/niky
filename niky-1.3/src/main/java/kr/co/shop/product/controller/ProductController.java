package kr.co.shop.product.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import kr.co.shop.common.domain.PageTO;
import kr.co.shop.common.utils.UploadFileUtils;
import kr.co.shop.product.domain.ProductDTO;
import kr.co.shop.product.service.ProductService;



@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Inject
	private ProductService pSerivce;
	@Inject
	private ServletContext sc;
	private String uploadPath = "D:" + File.separator + "upload";

	@RequestMapping(value = {"/list", "/list/{category}",
			"/list/{curpage}/{minprice}/{maxprice}/{category}/{keyword}", 
			"/list/{minprice}/{maxprice}/{category}/{keyword}",
			"/list/{curpage}/{category}/{keyword}"}, 
			method = RequestMethod.GET)
	public String list(@PathVariable Map<String, String> map, Model model) {
		PageTO<ProductDTO> pt = pSerivce.list(map);
		model.addAttribute("list", pt.getList());
		model.addAttribute("pt", pt);
		
		return "product/list";
	}
	
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public String insert(MultipartHttpServletRequest request) {
		String manufacturer = request.getParameter("manufacturer");
		String production = request.getParameter("production");
		String proname = request.getParameter("proname");
		String category = request.getParameter("category");
		String ssex = request.getParameter("sex");
		char sex = ssex.charAt(0);
		String sprice = request.getParameter("price");
		Integer price = Integer.parseInt(sprice);
		String swarranty = request.getParameter("production");
		Integer warranty = Integer.parseInt(swarranty);
		
		Map<String, MultipartFile> map = request.getFileMap();
		Set<String> set = map.keySet();
		List<String> list = new ArrayList<String>(set);
		List<String> uploadedFileList = new ArrayList<String>();
		
		for (int i = 0; i < list.size(); i++) {
			String key = list.get(i);
			MultipartFile file = map.get(key);
			
			try {
				String uploadedFilename = UploadFileUtils.uploadFile(uploadPath, file, sc);
				uploadedFileList.add(uploadedFilename);
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		ProductDTO dto = new ProductDTO(manufacturer, production, proname, null, category, sex, price, warranty, null);
		dto.setUploadedFileList(uploadedFileList);
		int result = 1;
		
		try {
			pSerivce.insert(dto);
		} catch (Exception e) {
			e.printStackTrace();
			result = 0;
		}
		
		if (result == 0) {
			try {
				UploadFileUtils.deleteUploadFiles(uploadPath, uploadedFileList);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return dto.getPronum()+"";
	}
}