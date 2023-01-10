<<<<<<< HEAD
package kr.co.shop.manager.domain;

import java.io.Serializable;
import java.util.Objects;

public class ShopManagerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
	private Integer phone;
	private String address;
	private char grade;
	private String department;
	private String position;
	
	public ShopManagerDTO() {
		// TODO Auto-generated constructor stub
	}

	public ShopManagerDTO(String id, String name, String email, Integer phone, String address, char grade,
			String department, String position) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.grade = grade;
		this.department = department;
		this.position = position;
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
		ShopManagerDTO other = (ShopManagerDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ShopManagerDTO [id=" + id + ", name=" + name + ", grade=" + grade + ", department=" + department
				+ ", position=" + position + "]";
	}
}
=======
package kr.co.shop.manager.domain;

import java.io.Serializable;
import java.util.Objects;

public class ShopManagerDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
	private Integer phone;
	private String address;
	private char grade;
	private String department;
	private String position;
	
	public ShopManagerDTO() {
		// TODO Auto-generated constructor stub
	}

	public ShopManagerDTO(String id, String name, String email, Integer phone, String address, char grade,
			String department, String position) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.grade = grade;
		this.department = department;
		this.position = position;
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
		ShopManagerDTO other = (ShopManagerDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "ShopManagerDTO [id=" + id + ", name=" + name + ", grade=" + grade + ", department=" + department
				+ ", position=" + position + "]";
	}
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
