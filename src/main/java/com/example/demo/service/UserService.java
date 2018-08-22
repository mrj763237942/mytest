package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService {
	public void create(User user);

	public void delete(String name);
}
