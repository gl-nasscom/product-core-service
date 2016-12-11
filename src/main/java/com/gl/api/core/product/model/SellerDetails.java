package com.gl.api.core.product.model;

public class SellerDetails {
	private String name,ratings, ratingsFrom;
	private boolean verified;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean getVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public String getRatings() {
		return ratings;
	}
	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
	public String getRatingsFrom() {
		return ratingsFrom;
	}
	public void setRatingsFrom(String ratingsFrom) {
		this.ratingsFrom = ratingsFrom;
	}
	public SellerDetails(String name, boolean verified, String ratings,
			String ratingsFrom) {
		super();
		this.name = name;
		this.verified = verified;
		this.ratings = ratings;
		this.ratingsFrom = ratingsFrom;
	}
	public SellerDetails() {
	}
}