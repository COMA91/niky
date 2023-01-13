package kr.co.shop.refund.domain;

import java.io.Serializable;
import java.util.Objects;

public class RefundDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private Integer ordernum;
	private String orderdate;
	private String proname;
	private Integer pronum;
	private Integer picked;
	private Integer indieprice;
	private Integer totalprice;
	private String askdate;
	private char isaccepted;
	private String acceptdate;
	private String comment;
	
	public RefundDTO() {
		// TODO Auto-generated constructor stub
	}

	public RefundDTO(String id, Integer ordernum, String orderdate, String proname, Integer pronum, Integer picked,
			Integer indieprice, Integer totalprice, String askdate, char isaccepted, String acceptdate,
			String comment) {
		super();
		this.id = id;
		this.ordernum = ordernum;
		this.orderdate = orderdate;
		this.proname = proname;
		this.pronum = pronum;
		this.picked = picked;
		this.indieprice = indieprice;
		this.totalprice = totalprice;
		this.askdate = askdate;
		this.isaccepted = isaccepted;
		this.acceptdate = acceptdate;
		this.comment = comment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(Integer ordernum) {
		this.ordernum = ordernum;
	}

	public String getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(String orderdate) {
		this.orderdate = orderdate;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public Integer getPronum() {
		return pronum;
	}

	public void setPronum(Integer pronum) {
		this.pronum = pronum;
	}

	public Integer getPicked() {
		return picked;
	}

	public void setPicked(Integer picked) {
		this.picked = picked;
	}

	public Integer getIndieprice() {
		return indieprice;
	}

	public void setIndieprice(Integer indieprice) {
		this.indieprice = indieprice;
	}

	public Integer getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(Integer totalprice) {
		this.totalprice = totalprice;
	}

	public String getAskdate() {
		return askdate;
	}

	public void setAskdate(String askdate) {
		this.askdate = askdate;
	}

	public char getIsaccepted() {
		return isaccepted;
	}

	public void setIsaccepted(char isaccepted) {
		this.isaccepted = isaccepted;
	}

	public String getAcceptdate() {
		return acceptdate;
	}

	public void setAcceptdate(String acceptdate) {
		this.acceptdate = acceptdate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ordernum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RefundDTO other = (RefundDTO) obj;
		return Objects.equals(ordernum, other.ordernum);
	}

	@Override
	public String toString() {
		return "RefundDTO [id=" + id + ", ordernum=" + ordernum + ", orderdate=" + orderdate + ", proname=" + proname
				+ ", pronum=" + pronum + ", picked=" + picked + ", totalprice=" + totalprice + ", askdate=" + askdate
				+ ", isaccepted=" + isaccepted + ", acceptdate=" + acceptdate + "]";
	}
	
	
}
