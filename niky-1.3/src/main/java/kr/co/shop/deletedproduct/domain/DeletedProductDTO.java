package kr.co.shop.deletedproduct.domain;

import java.io.Serializable;
import java.util.Objects;

public class DeletedProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String proname;
	private Integer pronum;
	private String manufacturer;
	private String production;
	private String category;
	private Integer price;
	private String deleteddate;
	
	public DeletedProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public DeletedProductDTO(String proname, Integer pronum, String manufacturer, String production, String category,
			Integer price, String deleteddate) {
		super();
		this.proname = proname;
		this.pronum = pronum;
		this.manufacturer = manufacturer;
		this.production = production;
		this.category = category;
		this.price = price;
		this.deleteddate = deleteddate;
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

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
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
		DeletedProductDTO other = (DeletedProductDTO) obj;
		return Objects.equals(pronum, other.pronum);
	}

	@Override
	public String toString() {
		return "DeletedProductDTO [proname=" + proname + ", pronum=" + pronum + ", manufacturer=" + manufacturer
				+ ", production=" + production + ", category=" + category + ", price=" + price + ", deleteddate="
				+ deleteddate + "]";
	}
	
	
}
