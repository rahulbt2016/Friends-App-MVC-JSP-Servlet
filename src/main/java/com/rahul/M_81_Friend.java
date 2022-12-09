package com.rahul;
public class M_81_Friend {
	
	//Instance Fields
	private int id;
	private String name;
	private String email;
	private int age;
	private String favouriteColor;
	
	//Constructors
	public M_81_Friend(int id, String name, String email, int age, String favouriteColor) {
		
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
		this.favouriteColor = favouriteColor;
	}
	
	public M_81_Friend(String name, String email, int age, String favouriteColor) {
		
		this(0, name, email, age, favouriteColor);
	}
	
	public M_81_Friend() {
		
		this(0, "", "", 0, "");
	}

	
	//Getters & Setters
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFavouriteColor() {
		return favouriteColor;
	}

	public void setFavouriteColor(String favouriteColor) {
		this.favouriteColor = favouriteColor;
	}
	
}
