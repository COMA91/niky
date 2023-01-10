package kr.co.shop.reply.domain;

import java.io.Serializable;
import java.util.Objects;

public class ReplyDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String proname;
	private Integer pronum;
	private Integer bno;
	private String id;
	private String comment;
	private String writeday;
	
	public ReplyDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReplyDTO(String proname, Integer pronum, Integer bno, String id, String comment, String writeday) {
		super();
		this.proname = proname;
		this.pronum = pronum;
		this.bno = bno;
		this.id = id;
		this.comment = comment;
		this.writeday = writeday;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
		return Objects.hash(id, pronum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyDTO other = (ReplyDTO) obj;
		return Objects.equals(id, other.id) && Objects.equals(pronum, other.pronum);
	}

	@Override
	public String toString() {
		return "ReplyDTO [proname=" + proname + ", pronum=" + pronum + ", bno=" + bno + ", id=" + id + ", comment="
				+ comment + ", writeday=" + writeday + "]";
	}

	
}
