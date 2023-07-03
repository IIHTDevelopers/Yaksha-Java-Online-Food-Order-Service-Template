package com.onlinefoodorderapplication.model;

public class Dish {
	private int id;

	private String name;

	private String ingredients;

	private int restaurantId;

	public Dish() {
		super();
	}

	public Dish(int id, String name, String ingredients, int restaurantId) {
		super();
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.restaurantId = restaurantId;
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

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", ingredients=" + ingredients + "]";
	}

}
