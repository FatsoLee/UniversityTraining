package com.lqz.web.postServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lqz.DAO.impl.PostDAOimpl;
import com.lqz.domain.Post;
import com.lqz.domain.User;

public class AddPostServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String title = request.getParameter("title").toString();
		String context = request.getParameter("context").toString();
		
		User user = (User) request.getSession().getAttribute("user");
		PostDAOimpl postDao = new PostDAOimpl();
		Post post = new Post();
		post.setTitle(title);
		post.setContext(context);
		post.setUserName(user.getAccount());
		post.setClickNumber(0);
		post.setReplyNumber(0);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(new Date());
		post.setDate(dateString);
		try {
			postDao.insertPost(post);
		} catch (SQLException e) {
			request.setAttribute("msg", "数据库插入异常");
			e.printStackTrace();
		}
		request.setAttribute("msg", "恭喜你，文章发表成功！");
		request.getRequestDispatcher("/result/handle-postResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
