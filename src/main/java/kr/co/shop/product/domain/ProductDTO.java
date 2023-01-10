<<<<<<< HEAD
package kr.co.shop.product.domain;

import java.io.Serializable;
import java.util.Objects;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String manufacturer;
	private String production;
	private String proname;
	private Integer pronum;
	private String category;
	private Integer price;
	private Integer warranty;
	private Integer stock;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(String manufacturer, String production, String proname, Integer pronum, String category,
			Integer price, Integer warranty, Integer stock) {
		super();
		this.manufacturer = manufacturer;
		this.production = production;
		this.proname = proname;
		this.pronum = pronum;
		this.category = category;
		this.price = price;
		this.warranty = warranty;
		this.stock = stock;
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
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(pronum, other.pronum);
	}

	@Override
	public String toString() {
		return "ShopProductDTO [manufacturer=" + manufacturer + ", production=" + production + ", proname=" + proname
				+ ", pronum=" + pronum + ", category=" + category + ", price=" + price + "]";
	}
}
=======
package kr.co.shop.product.domain;

import java.io.Serializable;
import java.util.Objects;

public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String manufacturer;
	private String production;
	private String proname;
	private Integer pronum;
	private String category;
	private Integer price;
	private Integer warranty;
	private Integer stock;
	
	public ProductDTO() {
		// TODO Auto-generated constructor stub
	}

	public ProductDTO(String manufacturer, String production, String proname, Integer pronum, String category,
			Integer price, Integer warranty, Integer stock) {
		super();
		this.manufacturer = manufacturer;
		this.production = production;
		this.proname = proname;
		this.pronum = pronum;
		this.category = category;
		this.price = price;
		this.warranty = warranty;
		this.stock = stock;
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
		ProductDTO other = (ProductDTO) obj;
		return Objects.equals(pronum, other.pronum);
	}

	@Override
	public String toString() {
		return "ShopProductDTO [manufacturer=" + manufacturer + ", production=" + production + ", proname=" + proname
				+ ", pronum=" + pronum + ", category=" + category + ", price=" + price + "]";
	}
}
>>>>>>> 9a5eb680e5e403752acbe55d9ce7fd159688979a
