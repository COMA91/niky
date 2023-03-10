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
}