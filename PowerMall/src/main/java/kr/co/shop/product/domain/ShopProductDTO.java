package kr.co.shop.product.domain;

import java.io.Serializable;
import java.util.Objects;

public class ShopProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sid;
	private String seller;
	private String manufacturer;
	private String production;
	private String proname;
	private String pronum;
	private String category;
	private Integer price;
	private Integer warranty;
	private Integer stock;
	
	public ShopProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ShopProductDTO(String sid, String seller, String manufacturer, String production, String proname,
			String pronum, String category, Integer price, Integer warranty, Integer stock) {
		super();
		this.sid = sid;
		this.seller = seller;
		this.manufacturer = manufacturer;
		this.production = production;
		this.proname = proname;
		this.pronum = pronum;
		this.category = category;
		this.price = price;
		this.warranty = warranty;
		this.stock = stock;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
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

	public String getProname() {
		return proname;
	}

	public void setProname(String proname) {
		this.proname = proname;
	}

	public String getPronum() {
		return pronum;
	}

	public void setPronum(String pronum) {
		this.pronum = pronum;
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

	public Integer getWarranty() {
		return warranty;
	}

	public void setWarranty(Integer warranty) {
		this.warranty = warranty;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
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
		ShopProductDTO other = (ShopProductDTO) obj;
		return Objects.equals(pronum, other.pronum);
	}

	@Override
	public String toString() {
		return "ShopProductDTO [seller=" + seller + ", manufacturer=" + manufacturer + ", production=" + production
				+ ", proname=" + proname + ", category=" + category + ", price=" + price + "]";
	}
}
