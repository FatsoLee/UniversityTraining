package com.lqz.web.userServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.lqz.domain.User;
import com.lqz.servive.UserService;
import com.lqz.servive.impl.UserServiceImpl;

public class EditDetailServlet extends HttpServlet {
	
	private static final long serialVersionUID = 5952689219411916553L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		UserService us = new UserServiceImpl();// 定义一个服务类
		User user = new User();
		
		try {
			BeanUtils.populate(user, request.getParameterMap());
		} catch (Exception e) {
			e.printStackTrace();
		}
		us.updateUser(user);
		request.getRequestDispatcher("/user/login/user-list.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
