package kr.co.shop.common.domain;

import java.util.List;

import kr.co.shop.product.domain.ProductDTO;

public class PageTO<T> {
	private static final long serialVersionUID = 1L;
	private int curpage = 1;
	private int perpage = 10;
	private int amount;
	private int totalPageNum;
	private int startNum;
	private int endNum;
	private int beginPageNum;
	private int finishPageNum;
	private int lineMax = 10;
	private String criteria;
	private String keyword;
	List<ProductDTO> list;
	
	public PageTO() {
		execute();
	}

	public PageTO(int curpage, int amount, String criteria, String keyword) {
		super();
		this.curpage = curpage;
		this.amount = amount;
		this.criteria = criteria;
		this.keyword = keyword;
		execute();
	}

	public PageTO(int curpage, int perpage, int amount, int totalPageNum, int startNum, int endNum, int beginPageNum,
			int finishPageNum, int lineMax, String criteria, String keyword, List<ProductDTO> list) {
		super();
		this.curpage = curpage;
		this.perpage = perpage;
		this.amount = amount;
		this.totalPageNum = totalPageNum;
		this.startNum = startNum;
		this.endNum = endNum;
		this.beginPageNum = beginPageNum;
		this.finishPageNum = finishPageNum;
		this.lineMax = lineMax;
		this.criteria = criteria;
		this.keyword = keyword;
		this.list = list;
	}

	public PageTO(int curpage, int perpage, int amount, int totalPageNum, int startNum, int endNum, int beginPageNum,
			int finishPageNum, int lineMax, String criteria, String keyword) {
		super();
		this.curpage = curpage;
		this.perpage = perpage;
		this.amount = amount;
		this.totalPageNum = totalPageNum;
		this.startNum = startNum;
		this.endNum = endNum;
		this.beginPageNum = beginPageNum;
		this.finishPageNum = finishPageNum;
		this.lineMax = lineMax;
		this.criteria = criteria;
		this.keyword = keyword;
		execute();
	}

	public List<ProductDTO> getList() {
		return list;
	}

	public void setList(List<ProductDTO> list) {
		this.list = list;
	}

	public int getCurpage() {
		return curpage;
	}

	public void setCurpage(int curpage) {
		this.curpage = curpage;
		execute();
	}

	public int getPerpage() {
		return perpage;
	}

	public void setPerpage(int perpage) {
		this.perpage = perpage;
		execute();
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
		execute();
	}

	public int getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public int getBeginPageNum() {
		return beginPageNum;
	}

	public void setBeginPageNum(int beginPageNum) {
		this.beginPageNum = beginPageNum;
	}

	public int getFinishPageNum() {
		return finishPageNum;
	}

	public void setFinishPageNum(int finishPageNum) {
		this.finishPageNum = finishPageNum;
	}

	public int getLineMax() {
		return lineMax;
	}

	public void setLineMax(int lineMax) {
		this.lineMax = lineMax;
		execute();
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	private void execute() {
		totalPageNum = (amount-1)/perpage+1;
		startNum = (curpage-1)*perpage;
		beginPageNum = ((curpage-1)/lineMax)*lineMax+1;
		finishPageNum = beginPageNum + lineMax -1;
		if (finishPageNum > totalPageNum) {
			finishPageNum = totalPageNum;
		}
	}
}
