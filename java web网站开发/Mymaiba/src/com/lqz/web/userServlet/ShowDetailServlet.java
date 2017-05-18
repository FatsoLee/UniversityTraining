package com.lqz.web.userServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lqz.domain.User;
import com.lqz.servive.UserService;
import com.lqz.servive.impl.UserServiceImpl;

public class ShowDetailServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String account = request.getParameter("account");
		UserService us = new UserServiceImpl();// 定义一个服务类
		User u = us.findUserByCount(account);// 根据表单的帐号查找
		
		request.setAttribute("user", u);
		request.getRequestDispatcher("/user/login/user-detail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
