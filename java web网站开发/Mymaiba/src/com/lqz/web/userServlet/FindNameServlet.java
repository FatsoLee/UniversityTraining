package com.lqz.web.userServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lqz.domain.User;
import com.lqz.servive.UserService;
import com.lqz.servive.impl.UserServiceImpl;

public class FindNameServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		String account = request.getParameter("account");

		User u = null;
		u = new User();
		UserService us = new UserServiceImpl();
		u = us.findUserByCount(account);
		if (u != null) {
			if (u.getAccount().equals(account))
				out.print(true);
		} else
			out.print(false);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
