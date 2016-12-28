package com.lqz.web.userServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lqz.domain.User;
import com.lqz.servive.UserService;
import com.lqz.servive.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String account = request.getParameter("account_lg").toString();
		String password = request.getParameter("password_lg").toString();

		// 判断帐号是否为空
		if (account == "") {
			request.setAttribute("msg", "帐号为空，请重新选择一个帐号！");
			request.getRequestDispatcher("/result/handle-userResult.jsp").forward(request, response);
			return;
		} else {
			UserService us = new UserServiceImpl();// 定义一个服务类
			User user = us.findUserByCount(account);
			
			if (user == null)// 帐号不存在
			{
				request.setAttribute("msg", "帐号不存在，登录失败！");
//				response.sendRedirect(request.getContextPath() + "/result/handle-userResult.jsp");
				request.getRequestDispatcher("/result/handle-userResult.jsp").forward(request, response);
				return;
			} else {// 帐号存在
				if (user.getPassword().equals(password))// 密码正确
				{
					HttpSession session = request.getSession();
					String forwordURL = (String) session.getAttribute("forwordURL");
					System.out.println("after login:" + forwordURL);
					if(forwordURL != null){
						session.removeAttribute("forwordURL");
						session.setAttribute("user", user);
						response.sendRedirect(forwordURL);
						return;
					}
					session.setAttribute("user", user);
					request.getRequestDispatcher("/user/login/article-list.jsp").forward(request, response);
					return;
				} else {// 密码错误
					// 跳转到失败页面。
					request.setAttribute("msg", "密码错误，登录失败！");
					request.setAttribute("action", "relogon");
					request.getRequestDispatcher("/result/handle-userResult.jsp").forward(request, response);
					return;
				} 
			}

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
