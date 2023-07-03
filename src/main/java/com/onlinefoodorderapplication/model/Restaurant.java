package com.onlinefoodorderapplication.model;

import java.util.List;

public class Restaurant {
	private int id;

	private String name;

	private List<Dish> dishes;

	private String address;

	public Restaurant() {
		super();
	}

	public Restaurant(int id, String name, List<Dish> dishes, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dishes = dishes;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", dishes=" + dishes + ", address=" + address + "]";
	}

}
