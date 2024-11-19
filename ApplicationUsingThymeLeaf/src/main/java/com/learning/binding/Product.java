package com.learning.binding;

public class Product {

	private Integer pId;
	private String name;
	private Long price;

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", name=" + name + ", price=" + price + "]";
	}

}
