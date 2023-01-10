<<<<<<< HEAD
package kr.co.shop.order.domain;

import java.io.Serializable;
import java.util.Objects;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String birth;
	private String email;
	private Integer phone;
	private String address;
	private Integer ordernum;
	private String orderdate;
	private String proname;
	private Integer pronum;
	private Integer pickedcount;
	private Integer indieprice;
	private Integer totalprice;
	private Integer savingpoint;
	private String status;
	private char ispaid;
	private char isrefunded;
	
	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}

	public OrderDTO(String id, String name, String birth, String email, Integer phone, String address, Integer ordernum,
			String orderdate, String proname, Integer pronum, Integer pickedcount, Integer indieprice,
			Integer totalprice, Integer savingpoint, String status, char ispaid, char isrefunded) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.ordernum = ordernum;
		this.orderdate = orderdate;
		this.proname = proname;
		this.pronum = pronum;
		this.pickedcount = pickedcount;
		this.indieprice = indieprice;
		this.totalprice = totalprice;
		this.savingpoint = savingpoint;
		this.status = status;
		this.ispaid = ispaid;
		this.isrefunded = isrefunded;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Integer getPickedcount() {
		return pickedcount;
	}

	public void setPickedcount(Integer pickedcount) {
		this.pickedcount = pickedcount;
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

	public Integer getSavingpoint() {
		return savingpoint;
	}

	public void setSavingpoint(Integer savingpoint) {
		this.savingpoint = savingpoint;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public char getIspaid() {
		return ispaid;
	}

	public void setIspaid(char ispaid) {
		this.ispaid = ispaid;
	}

	public char getIsrefunded() {
		return isrefunded;
	}

	public void setIsrefunded(char isrefunded) {
		this.isrefunded = isrefunded;
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
		OrderDTO other = (OrderDTO) obj;
		return Objects.equals(ordernum, other.ordernum);
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", ordernum="
				+ ordernum + ", orderdate=" + orderdate + ", proname=" + proname + ", pronum=" + pronum
				+ ", pickedcount=" + pickedcount + ", indieprice=" + indieprice + ", totalprice=" + totalprice
				+ ", savingpoint=" + savingpoint + ", status=" + status + ", ispaid=" + ispaid + ", isrefunded="
				+ isrefunded + "]";
	}
}
=======
package kr.co.shop.order.domain;

import java.io.Serializable;
import java.util.Objects;

public class OrderDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String birth;
	private String email;
	private Integer phone;
	private String address;
	private Integer ordernum;
	private String orderdate;
	private String proname;
	private Integer pronum;
	private Integer pickedcount;
	private Integer indieprice;
	private Integer totalprice;
	private Integer savingpoint;
	private String status;
	private char ispaid;
	private char isrefunded;
	
	public OrderDTO() {
		// TODO Auto-generated constructor stub
	}

	public OrderDTO(String id, String name, String birth, String email, Integer phone, String address, Integer ordernum,
			String orderdate, String proname, Integer pronum, Integer pickedcount, Integer indieprice,
			Integer totalprice, Integer savingpoint, String status, char ispaid, char isrefunded) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.ordernum = ordernum;
		this.orderdate = orderdate;
		this.proname = proname;
		this.pronum = pronum;
		this.pickedcount = pickedcount;
		this.indieprice = indieprice;
		this.totalprice = totalprice;
		this.savingpoint = savingpoint;
		this.status = status;
		this.ispaid = ispaid;
		this.isrefunded = isrefunded;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Integer getPickedcount() {
		return pickedcount;
	}

	public void setPickedcount(Integer pickedcount) {
		this.pickedcount = pickedcount;
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

	public Integer getSavingpoint() {
		return savingpoint;
	}

	public void setSavingpoint(Integer savingpoint) {
		this.savingpoint = savingpoint;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public char getIspaid() {
		return ispaid;
	}

	public void setIspaid(char ispaid) {
		this.ispaid = ispaid;
	}

	public char getIsrefunded() {
		return isrefunded;
	}

	public void setIsrefunded(char isrefunded) {
		this.isrefunded = isrefunded;
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
		OrderDTO other = (OrderDTO) obj;
		return Objects.equals(ordernum, other.ordernum);
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", ordernum="
				+ ordernum + ", orderdate=" + orderdate + ", proname=" + proname + ", pronum=" + pronum
				+ ", pickedcount=" + pickedcount + ", indieprice=" + indieprice + ", totalprice=" + totalprice
				+ ", savingpoint=" + savingpoint + ", status=" + status + ", ispaid=" + ispaid + ", isrefunded="
				+ isrefunded + "]";
	}
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
