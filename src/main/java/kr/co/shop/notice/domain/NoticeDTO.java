package kr.co.shop.notice.domain;

import java.io.Serializable;
import java.util.Objects;

public class NoticeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer bno;
	private String id;
	private char grade;
	private String criteria;
	private String title;
	private String content;
	private String writeday;
	
	public NoticeDTO() {
		// TODO Auto-generated constructor stub
	}

	public NoticeDTO(Integer bno, String id, char grade, String criteria, String title, String content,
			String writeday) {
		super();
		this.bno = bno;
		this.id = id;
		this.grade = grade;
		this.criteria = criteria;
		this.title = title;
		this.content = content;
		this.writeday = writeday;
	}

	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public String getCriteria() {
		return criteria;
	}

	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriteday() {
		return writeday;
	}

	public void setWriteday(String writeday) {
		this.writeday = writeday;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(bno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NoticeDTO other = (NoticeDTO) obj;
		return Objects.equals(bno, other.bno);
	}

	@Override
	public String toString() {
		return "NoticeDTO [bno=" + bno + ", id=" + id + ", grade=" + grade + ", criteria=" + criteria + ", title="
				+ title + ", content=" + content + ", writeday=" + writeday + "]";
	}
	
	
}
