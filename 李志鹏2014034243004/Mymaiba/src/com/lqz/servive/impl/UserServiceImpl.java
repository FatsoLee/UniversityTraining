package com.lqz.servive.impl;

import java.sql.SQLException;
import java.util.List;

import com.lqz.DAO.UserDao;
import com.lqz.DAO.impl.UserDAOImpl;
import com.lqz.domain.User;
import com.lqz.servive.UserService;

public class UserServiceImpl implements UserService {

	public User findUserByCount(String count) {
		UserDao u = new UserDAOImpl();
		User user = null;
		try {
			user =  u.findUserByCount(count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	public void addUser(User user) {
		UserDao u = new UserDAOImpl();
		try {
			u.insertUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> findUser() {
		UserDao u = new UserDAOImpl();
		List<User> query = null;
		try {
			query = u.findAllUser();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return query;
	}

	@Override
	public void deleteUser(String account) {
		UserDao u = new UserDAOImpl();
		try {
			u.deleteUser(account);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(User user) {
		UserDao u = new UserDAOImpl();		
		try {
			u.updateUser(user);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<User> findVagueUser(String vagueCount) {
		UserDao u = new UserDAOImpl();
		List<User> query = null;
		try {
			u.findUserByVagueCount(vagueCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return query;
	}
}
