package service.impl;

import org.junit.Assert;
import org.junit.Test;

import service.UserDAO;

import entity.Users;

public class TestUserDAOImpl {

	@Test
	public void testUserLogin() {
		Users u = new Users(1, "��ɽ", "123456");
		UserDAO userdao = new UserDAOImpl();
		Assert.assertEquals(true, userdao.userLogin(u));
	}
	
}
