package com.onlinefoodorderapplication.repository;

import java.util.List;

import com.onlinefoodorderapplication.model.Dish;
import com.onlinefoodorderapplication.model.Restaurant;

public class RestaurantDAOImpl implements RestaurantDAO {

	private final String url;
	private final String username;
	private final String password;

	public RestaurantDAOImpl(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public void createRestaurant(Restaurant restaurant) {

	}

	@Override
	public Restaurant getRestaurantById(int id) {
		return null;
	}

	@Override
	public List<Restaurant> getAllRestaurants() {
		return null;
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {

	}

	@Override
	public boolean deleteRestaurant(int id) {
		return false;
	}

	private List<Dish> getDishesByRestaurantId(int restaurantId) {
		return null;
	}

	@Override
	public List<Restaurant> searchRestaurantsByName(String name) {
		return null;
	}

	@Override
	public List<Restaurant> searchRestaurantsByLocation(String location) {
		return null;
	}

	@Override
	public List<Restaurant> searchRestaurantsByDishName(String dishName) {
		return null;
	}

	private List<Dish> getDishesForRestaurant(int restaurantId) {
		return null;
	}

	@Override
	public void deleteAllRestaurants() {

	}

}
