package com.vastika.user_management.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vastika.user_management.model.User;
import com.vastika.user_management.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		userRepository.saveUser(user);
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);
		
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteUser(id);
		
	}

	@Override
	public User getUser(int id) {
		return userRepository.getUser(id);
		
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.getAllUser();
	}
}