package com.hemant.scattergather;

public class Result {

	private int price;
	private String provider;
	private int days;
	
	public Result() {}
	
	public Result(int price, String provider, int days) {
		this.price = price;
		this.provider = provider;
		this.days = days;
	}

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	
}
