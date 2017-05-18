package com.lqz.servive;

import java.sql.SQLException;
import java.util.List;

import com.lqz.domain.User;

public interface UserService {
	/**
	 * 
	 * @param count
	 * @return
	 * @throws SQLException
	 */
	public User findUserByCount(String count);

	/**
	 * 
	 * @param user
	 */
	public void addUser(User user);
	
	/**
	 * 
	 * @return
	 */
	public List<User> findUser();
	
	/**
	 * 
	 * @param account
	 */
	public void deleteUser(String account);
	
	/**
	 * 
	 * @param user
	 */
	public void updateUser(User user);
	
	public List<User> findVagueUser(String account);
}
