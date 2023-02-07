package kr.co.shop.qna.domain;

import java.io.Serializable;
import java.util.Objects;

public class QnaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer bno;
	private String cid;
	private String pw;
	private String title;
	private String content;
	private String writedate;
	private String answer;
	
	public QnaDTO() {
		// TODO Auto-generated constructor stub
	}

	

	public QnaDTO(String cid, String pw, String title, String content) {
		super();
		this.cid = cid;
		this.pw = pw;
		this.title = title;
		this.content = content;
	}



	public QnaDTO(Integer bno, String cid, String title, String content, String writedate, String answer) {
		super();
		this.bno = bno;
		this.cid = cid;
		this.title = title;
		this.content = content;
		this.writedate = writedate;
		this.answer = answer;
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


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	
	
	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWritedate() {
		return writedate;
	}

	public void setWritedate(String writedate) {
		this.writedate = writedate;
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
		return "QnaDTO [bno=" + bno + ", cid=" + cid + ", title=" + title + ", content=" + content + ", writedate="
				+ writedate + ", answer=" + answer + "]";
	}

	

	
}
