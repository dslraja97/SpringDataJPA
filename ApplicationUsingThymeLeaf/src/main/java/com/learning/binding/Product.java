package com.learning.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Product {

	@NotNull(message = "ProductId is reqired!")
	private Integer pId;
	@NotBlank(message = "Name is reqired!")
	private String name;
	@NotNull(message = "Price is reqired!")
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
