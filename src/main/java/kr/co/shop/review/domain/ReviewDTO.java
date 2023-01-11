package kr.co.shop.review.domain;

import java.io.Serializable;
import java.util.Objects;

public class ReviewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String proname;
	private Integer pronum;
	private String category;
	private String id;
	private Integer rscore;
	private String comment;
	
	public ReviewDTO() {
		// TODO Auto-generated constructor stub
	}

	public ReviewDTO(String proname, Integer pronum, String category, String id, Integer rscore, String comment) {
		super();
		this.proname = proname;
		this.pronum = pronum;
		this.category = category;
		this.id = id;
		this.rscore = rscore;
		this.comment = comment;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getRscore() {
		return rscore;
	}

	public void setRscore(Integer rscore) {
		this.rscore = rscore;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(pronum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReviewDTO other = (ReviewDTO) obj;
		return Objects.equals(pronum, other.pronum);
	}

	@Override
	public String toString() {
		return "ReviewDTO [proname=" + proname + ", pronum=" + pronum + ", category=" + category + ", id=" + id
				+ ", rscore=" + rscore + ", comment=" + comment + "]";
	}
}