package com.onlinefoodorderapplication;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.jboss.jandex.Main;

import com.onlinefoodorderapplication.model.Dish;
import com.onlinefoodorderapplication.model.Restaurant;
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

	public static void createDatabaseAndTablesIfNotExists(String url, String username, String password)
			throws SQLException {
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			String createDatabaseQuery = "CREATE DATABASE IF NOT EXISTS food_order_service";
			String createRestaurantTableQuery = "CREATE TABLE IF NOT EXISTS restaurant ("
					+ "id INT AUTO_INCREMENT PRIMARY KEY," + "name VARCHAR(20) NOT NULL,"
					+ "address VARCHAR(10) NOT NULL" + ")";
			String createDishTableQuery = "CREATE TABLE IF NOT EXISTS dish (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
					+ "name VARCHAR(10) NOT NULL," + "ingredients VARCHAR(100) NOT NULL,"
					+ "restaurant_id INT NOT NULL," + "FOREIGN KEY (restaurant_id) REFERENCES restaurant(id)" + ")";

			Statement statement = connection.createStatement();
			statement.executeUpdate(createDatabaseQuery);
			statement.executeUpdate("USE food_order_service");
			statement.executeUpdate(createRestaurantTableQuery);
			statement.executeUpdate(createDishTableQuery);
		}
	}

	public static void createDatabaseIfNotExists(String url, String username, String password) throws SQLException {
		try (Connection connection = DriverManager.getConnection(url, username, password)) {
			String createDatabaseQuery = "CREATE DATABASE IF NOT EXISTS food_order_service";

			Statement statement = connection.createStatement();
			statement.executeUpdate(createDatabaseQuery);
		}
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
