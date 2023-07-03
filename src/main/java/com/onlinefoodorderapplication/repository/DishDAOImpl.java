package com.onlinefoodorderapplication.repository;

import java.util.List;

import com.onlinefoodorderapplication.model.Dish;

public class DishDAOImpl implements DishDAO {

	private final String url;
	private final String username;
	private final String password;

	public DishDAOImpl(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public void createDish(Dish dish) {

	}

	@Override
	public Dish getDishById(int id) {
		return null;
	}

	@Override
	public List<Dish> getAllDishes() {
		return null;
	}

	@Override
	public void updateDish(Dish dish) {

	}

	@Override
	public boolean deleteDish(int id) {
		return false;
	}

	@Override
	public List<Dish> searchDishesByIngredients(String ingredients) {
		return null;
	}

	@Override
	public void removeAllDishes() {

	}
}
