package com.lqz.DAO.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.lqz.util.C3P0Util;
import com.lqz.DAO.UserDao;
import com.lqz.domain.User;

public class UserDAOImpl implements UserDao {

	@Override
	public void insertUser(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("INSERT INTO user(account, password, username, age, email) VALUES(?,?,?,?,?)", user.getAccount(), user.getPassword(), user.getUsername(),
				user.getAge(), user.getEmail());
	}

	@Override
	public void deleteUser(String account) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("delete from user where account=?", account);
	}

	@Override
	public User findUserByCount(String acount) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from user where account=?", new BeanHandler<User>(User.class), acount);
	}

	@Override
	public List<User> findAllUser() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from user", new BeanListHandler<User>(User.class));
	}

	@Override
	public void updateUser(User user) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("update user set password=?,username=?,age=?,email=? where account=?", user.getPassword(),
				user.getUsername(), user.getAge(), user.getEmail(), user.getAccount());
	}
	
	@Override
	public List<User> findUserByVagueCount(String vagueCount) throws SQLException {
		String ss = "%"+vagueCount+"%";
		System.out.println("vagueCount = "+ vagueCount);
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from user where account like ?", new BeanListHandler<User>(User.class), ss);
	}
}
