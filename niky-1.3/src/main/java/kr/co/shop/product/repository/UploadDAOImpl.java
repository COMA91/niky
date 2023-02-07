package kr.co.shop.product.repository;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class UploadDAOImpl implements UploadDAO {
	@Autowired
	private SqlSession session;
	
	private final String NS = "kr.co.upload";

	@Override
	public void insert(Map<String, Object> map) {
		session.insert(NS+".insert", map);
	}
	
}
