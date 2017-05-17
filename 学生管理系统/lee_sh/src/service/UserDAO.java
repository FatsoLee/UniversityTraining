package service;

import entity.Users;

public interface UserDAO {
	
	//用户登录方法
	public boolean userLogin(Users u);
}
