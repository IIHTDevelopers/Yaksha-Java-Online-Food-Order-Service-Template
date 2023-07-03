package com.onlinefoodorderapplication;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import org.jboss.jandex.Main;

import com.onlinefoodorderapplication.repository.DishDAO;
import com.onlinefoodorderapplication.repository.DishDAOImpl;
import com.onlinefoodorderapplication.repository.RestaurantDAO;
import com.onlinefoodorderapplication.repository.RestaurantDAOImpl;

public class OnlineFoodOrderApplication {
	private static RestaurantDAO restaurantDAO;
	private static DishDAO dishDAO;
	private static Scanner scanner;

	public static void main(String[] args) {
		Properties properties = new Properties();

		try (InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("application.properties")) {
			properties.load(inputStream);

			String url = properties.getProperty("jdbc.url");
			String username = properties.getProperty("jdbc.username");
			String password = properties.getProperty("jdbc.password");

			createDatabaseIfNotExists(url, username, password);
			createDatabaseAndTablesIfNotExists(url, username, password);

			restaurantDAO = new RestaurantDAOImpl(url, username, password);
			dishDAO = new DishDAOImpl(url, username, password);

			// write your code here for options
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static void getAllDishes() {

	}

	private static void printMenu() {

	}

	private static int getUserChoice() {
		return 0;
	}

	private static void createRestaurant() {

	}

	private static void createDish() {

	}

	private static void updateRestaurant() {

	}

	private static void updateDish() {

	}

	private static void deleteRestaurant() {

	}

	private static void deleteDish() {

	}

	private static void getRestaurantById() {

	}

	private static void getAllRestaurants() {

	}

	public static void createDatabaseAndTablesIfNotExists(String url, String username, String password) {

	}

	public static void createDatabaseIfNotExists(String url, String username, String password) throws SQLException {

	}

	private static void searchRestaurantsByName() {

	}

	private static void searchRestaurantsByLocation() {

	}

	private static void searchRestaurantsByDishName() {

	}

	private static void searchDishesByIngredients() {

	}

	public static void removeAllDishes() {

	}

	private static void deleteAllRestaurants() {

	}

}
