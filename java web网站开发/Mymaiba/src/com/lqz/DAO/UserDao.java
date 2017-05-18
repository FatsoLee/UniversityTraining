package com.lqz.DAO;

import java.sql.SQLException;
import java.util.List;

import com.lqz.domain.User;

public interface UserDao {
	/**
	 * 
	 * @param count
	 * @return
	 * @throws SQLException
	 */
	public User findUserByCount(String count) throws SQLException;

	/**
	 * 
	 * @param user
	 * @throws SQLException
	 */
	public void insertUser(User user) throws SQLException;

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public List<User> findAllUser() throws SQLException;
	
	/**
	 * 
	 * @throws SQLException
	 */
	public void deleteUser(String account) throws SQLException;
	
	/**
	 * 
	 * @param user
	 * @throws SQLException
	 */
	public void updateUser(User user) throws SQLException;
	
	public List<User> findUserByVagueCount(String acount) throws SQLException;
}
