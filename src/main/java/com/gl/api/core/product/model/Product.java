package com.gl.api.core.product.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name, cost, discount, rating,
			imageUrl;
	private boolean inStock, cashOnDelivery;
	private List<String> description = new ArrayList<String>();
	private SellerDetails sellerDetails;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public boolean getInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public boolean getCashOnDelivery() {
		return cashOnDelivery;
	}
	public void setCashOnDelivery(boolean cashOnDelivery) {
		this.cashOnDelivery = cashOnDelivery;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public List<String> getDescription() {
		return description;
	}
	public void setDescription(List<String> description) {
		this.description = description;
	}
	public SellerDetails getSellerDetails() {
		return sellerDetails;
	}
	public void setSellerDetails(SellerDetails sellerDetails) {
		this.sellerDetails = sellerDetails;
	}
	public Product(String name, String cost, String discount,
			boolean inStock, String rating, boolean cashOnDelivery,
			String imageUrl, List<String> description,
			SellerDetails sellerDetails) {
		super();
		this.name = name;
		this.cost = cost;
		this.discount = discount;
		this.inStock = inStock;
		this.rating = rating;
		this.cashOnDelivery = cashOnDelivery;
		this.imageUrl = imageUrl;		
		this.description = description;
		this.sellerDetails = sellerDetails;
	}
	public Product() {
	}
}