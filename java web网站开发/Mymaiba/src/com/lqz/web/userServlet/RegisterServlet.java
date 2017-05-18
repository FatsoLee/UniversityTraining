package com.lqz.web.userServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.gdin.mail.Mail;
import com.lqz.domain.User;
import com.lqz.servive.UserService;
import com.lqz.servive.impl.UserServiceImpl;

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		String account = request.getParameter("account").toString();

		// 判断帐号是否为空
		if (account == "") {
			request.setAttribute("msg", "帐号为空，请重新选择一个帐号！");
			request.getRequestDispatcher("/result/handle-userResult.jsp.jsp").forward(request, response);
			return;
		} else {
			UserService us = new UserServiceImpl(); // 定义一个服务类
			User u = us.findUserByCount(account); // 根据表单的帐号查找
			if (u != null) {
				// 判断帐号是否已被使用
				if (u.getAccount().equals(account))
					request.setAttribute("msg", "该帐号已被使用，请重新选择一个帐号！");
				request.getRequestDispatcher("/result/handle-userResult.jsp.jsp").forward(request, response);
				return;
			} else {
				// 进入这里说明帐号可以注册,但仍要判断格式
				String[] paras = request.getParameterValues("paras");
				String ss = "";
				for (String string : paras) {
					if (string != "") {
						ss += string;
						ss += "、";
					}
				}
				if (ss.length() > 0)
					ss = ss.substring(0, ss.length() - 1);
				if (ss.length() != 0) {
					// 判断输入是否合法
					request.setAttribute("msg", ss + "的格式不正确啊！");
					request.getRequestDispatcher("/result/handle-userResult.jsp.jsp").forward(request, response);
				} else {
					// 成功注册
					User user = new User();
					try {
						// 获取表单数据
						BeanUtils.populate(user, request.getParameterMap());
						us.addUser(user);
						Mail m = new Mail();
						String url = "http://localhost:8080/Mymaiba/user/user-login.jsp";
						m.send(url,user.getEmail());
					} catch (Exception e) {
						e.printStackTrace();
					}
					request.setAttribute("msg", "恭喜你，注册成功！");
					request.getRequestDispatcher("/user/user-login.jsp").forward(request, response);
				}
				return;
			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
