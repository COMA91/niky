package kr.co.shop.manager.domain;

import java.io.Serializable;
import java.util.Objects;

public class ManagerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String pw;
	private String email;
	private Integer phone;
	private String address;
	private char grade;
	private String department;
	private String position;
	private final String secretcode = "powermallmanagersecretcode1";
	private String joiningdate;
	

	public ManagerDTO() {
		// TODO Auto-generated constructor stub
	}


	public ManagerDTO(String id, String name, String pw, String email, Integer phone, String address, char grade,
			String department, String position, String joiningdate) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.grade = grade;
		this.department = department;
		this.position = position;
		this.joiningdate = joiningdate;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	
	public String getSecretcode() {
		return secretcode;
	}

	

	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getJoiningdate() {
		return joiningdate;
	}


	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
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
		ManagerDTO other = (ManagerDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ShopManagerDTO [id=" + id + ", name=" + name + ", grade=" + grade + ", department=" + department
				+ ", position=" + position + "]";
	}
}