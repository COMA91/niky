<<<<<<< HEAD
package kr.co.shop.delivery.domain;

import java.io.Serializable;
import java.util.Objects;

public class DeliveryDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String pw;
	private String name;
	private String birth;
	private Integer age;
	private char sex;
	private String email;
	private Integer phone;
	private String address;
	private char grade;
	private Integer point;
	
	public DeliveryDTO() {
		// TODO Auto-generated constructor stub
	}

	public DeliveryDTO(String id, String pw, String name, String birth, Integer age, char sex, String email,
			Integer phone, String address, char grade, Integer point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.sex = sex;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.grade = grade;
		this.point = point;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
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

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeliveryDTO other = (DeliveryDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}
=======
package kr.co.shop.delivery.domain;

import java.io.Serializable;
import java.util.Objects;

public class DeliveryDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer ordernum;
	private String orderdate;
	private Integer pronum;
	private String proname;
	private String id;
	private String name;
	private Integer phone;
	private String address;
	private String hdc;
	private String status;
	private Integer requiredday;
	
	public DeliveryDTO() {
		// TODO Auto-generated constructor stub
	}

	public DeliveryDTO(Integer ordernum, String orderdate, Integer pronum, String proname, String id, String name,
			Integer phone, String address, String hdc, String status, Integer requiredday) {
		super();
		this.ordernum = ordernum;
		this.orderdate = orderdate;
		this.pronum = pronum;
		this.proname = proname;
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.hdc = hdc;
		this.status = status;
		this.requiredday = requiredday;
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

	public Integer getPronum() {
		return pronum;
	}

	public void setPronum(Integer pronum) {
		this.pronum = pronum;
	}

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
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

	public String getHdc() {
		return hdc;
	}

	public void setHdc(String hdc) {
		this.hdc = hdc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getRequiredday() {
		return requiredday;
	}

	public void setRequiredday(Integer requiredday) {
		this.requiredday = requiredday;
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
		DeliveryDTO other = (DeliveryDTO) obj;
		return Objects.equals(ordernum, other.ordernum);
	}

	@Override
	public String toString() {
		return "DeliveryDTO [ordernum=" + ordernum + ", orderdate=" + orderdate + ", pronum=" + pronum + ", proname="
				+ proname + ", id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", hdc="
				+ hdc + ", status=" + status + ", requiredday=" + requiredday + "]";
	}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
}