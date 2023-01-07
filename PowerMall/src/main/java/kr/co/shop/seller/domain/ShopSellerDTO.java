package kr.co.shop.seller.domain;

import java.io.Serializable;
import java.util.Objects;

public class ShopSellerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sid;
	private String name;
	private String email;
	private Integer phone;
	private String address;
	private char grade;
	private String seller;
	private Integer registration;
	
	public ShopSellerDTO() {
		// TODO Auto-generated constructor stub
	}

	public ShopSellerDTO(String sid, String name, String email, Integer phone, String address, char grade,
			String seller, Integer registration) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.grade = grade;
		this.seller = seller;
		this.registration = registration;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public Integer getRegistration() {
		return registration;
	}

	public void setRegistration(Integer registration) {
		this.registration = registration;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(sid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ShopSellerDTO other = (ShopSellerDTO) obj;
		return Objects.equals(sid, other.sid);
	}

	@Override
	public String toString() {
		return "ShopSellerDTO [sid=" + sid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
				+ address + ", grade=" + grade + ", seller=" + seller + ", registration=" + registration + "]";
	}
}