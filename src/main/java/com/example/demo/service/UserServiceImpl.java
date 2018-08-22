package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void create(User user) {
		jdbcTemplate.update("insert into USER(ID,NAME,AGE) values(?,?,?)",
				user.getId(), user.getName(), user.getAge());
	}

	@Override
	public void delete(String name) {
		jdbcTemplate.update("delete form USER where NAME=?", name);
	}

}
