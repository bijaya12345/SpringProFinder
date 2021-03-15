package com.vastika.user_management.repository;

import java.util.List;

import com.vastika.user_management.model.User;

public interface UserRepository {
	
	void saveUser(User user);
	void updateUser(User user);
	void deleteUser(int id);
	User getUser(int id);
	List<User> getAllUser();

}
