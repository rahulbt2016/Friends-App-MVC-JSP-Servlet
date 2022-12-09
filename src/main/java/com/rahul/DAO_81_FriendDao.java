package com.rahul;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO_81_FriendDao {
	
	private Connection connection;
	
	private void connectDb() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/asg5_rahul", "root", "root");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	private void closeConnection() {
		
		try {
			
			if(!connection.isClosed())
				connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
	}
	
	public ArrayList<M_81_Friend> getFriends() {
		
		ArrayList<M_81_Friend> friends = new ArrayList<M_81_Friend>();
		M_81_Friend friend;
		
		connectDb();
		
		String selectQuery = "select * from friends;";
		
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(selectQuery);
			
			while(resultSet.next()) {
				
				friend = new M_81_Friend(resultSet.getInt("id"),
										resultSet.getString("name"),
										resultSet.getString("email"),
										resultSet.getInt("age"),
										resultSet.getString("favouriteColor"));
						
				friends.add(friend);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		closeConnection();
		
		return friends;
	}
	
	
	public void insertFriend(M_81_Friend friend) {
		
		connectDb();
		
		String insertQuery = "insert into friends (name, email, age, favouriteColor) "
							+ "values ('" + friend.getName() + "', '" 
							+ friend.getEmail() + "', " 
							+ friend.getAge() + ", '" 
							+ friend.getFavouriteColor() + "');";
		
		Statement statement;
		
		try {
			statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		closeConnection();
	}
	
	public void deleteFriend(int id) {
		
		connectDb();
		
		String deleteQuery = "delete from friends where id = " + id + ";";
		
		Statement statement;
		
		try {
			statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		closeConnection();
	}
	
}
