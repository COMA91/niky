package kr.co.shop.deletedmember.domain;

import java.io.Serializable;
import java.util.Objects;

public class DeletedMemberDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String email;
	private char grade;
	private String deleteddate;
	
	public DeletedMemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public DeletedMemberDTO(String id, String name, String email, char grade, String deleteddate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.grade = grade;
		this.deleteddate = deleteddate;
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

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getDeleteddate() {
		return deleteddate;
	}

	public void setDeleteddate(String deleteddate) {
		this.deleteddate = deleteddate;
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
		DeletedMemberDTO other = (DeletedMemberDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "DeletedMemberDTO [id=" + id + ", name=" + name + ", email=" + email + ", grade=" + grade
				+ ", deleteddate=" + deleteddate + "]";
	}
	
	
}
