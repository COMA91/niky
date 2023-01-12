package kr.co.shop.qna.domain;

import java.io.Serializable;
import java.util.Objects;

public class QnaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer bno;
	private String cid;
	private char grade;
	private String criteria;
	private String title;
	private String content;
	private String writeday;
	private String mid;
	private String answerday;
	private String isanswered;
	
	public QnaDTO() {
		// TODO Auto-generated constructor stub
	}

	public QnaDTO(Integer bno, String cid, char grade, String criteria, String title, String content, String writeday,
			String mid, String answerday, String isanswered) {
		super();
		this.bno = bno;
		this.cid = cid;
		this.grade = grade;
		this.criteria = criteria;
		this.title = title;
		this.content = content;
		this.writeday = writeday;
		this.mid = mid;
		this.answerday = answerday;
		this.isanswered = isanswered;
	}

	public Integer getBno() {
		return bno;
	}

	public void setBno(Integer bno) {
		this.bno = bno;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
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

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public String getAnswerday() {
		return answerday;
	}

	public void setAnswerday(String answerday) {
		this.answerday = answerday;
	}

	public String getIsanswered() {
		return isanswered;
	}

	public void setIsanswered(String isanswered) {
		this.isanswered = isanswered;
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
		QnaDTO other = (QnaDTO) obj;
		return Objects.equals(bno, other.bno);
	}

	@Override
	public String toString() {
		return "QnaDTO [bno=" + bno + ", cid=" + cid + ", grade=" + grade + ", criteria=" + criteria + ", title="
				+ title + ", content=" + content + ", writeday=" + writeday + ", mid=" + mid + ", answerday="
				+ answerday + ", isanswered=" + isanswered + "]";
	}

	
}
