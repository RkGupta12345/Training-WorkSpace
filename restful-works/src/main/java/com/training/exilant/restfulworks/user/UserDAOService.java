package com.training.exilant.restfulworks.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
	private static List<User> users = new ArrayList<>();
	private static int userCount = 0;

	static {
		users.add(new User(101, "Ravi kumar", new Date()));
		users.add(new User(102, "Ravi Gupta", new Date()));
		users.add(new User(103, "Rajesh Kumar", new Date()));
	}

	public List<User> getAllUsers() {
		return users;
	}

	public User saveUser(User user) {
		if (user.getUserId() == null) {
			user.setUserId(++userCount);
		}
		users.add(user);
		return user;
	}

	public User getUser(int userId) {
		for (User user : users) {
			if (user.getUserId() == userId) {

				return user;
			}

		}
		return null;
	}

	public User deleteUser(int userId) {
		System.out.println("delete");
		User user2=null;
		for (User user : users) {
			if (user.getUserId() == userId) {
				user2=user;
			users.remove(user);
			}

		}
		return user2;
	}

	public User updateUser(User user) {
		for (User user1 : users) {
			if (user.getUserId() ==user1.getUserId()) {
				user1.setName(user.getName());
				user1.setUserId(user.getUserId());
				user1.setBirthDate(user.getBirthDate());
				return user1;
			}

		}
		return null;
	}
}
