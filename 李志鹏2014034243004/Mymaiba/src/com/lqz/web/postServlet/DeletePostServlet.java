package com.lqz.web.postServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lqz.DAO.impl.CommentDaoImpl;
import com.lqz.DAO.impl.PostDAOimpl;

public class DeletePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String postId = request.getParameter("postId").toString();
		try {
			new PostDAOimpl().deletePost(Integer.valueOf(postId));
			new CommentDaoImpl().deleteCommentByPostId(Integer.valueOf(postId));
		} catch (NumberFormatException | SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("msg", "帖子删除成功！");
		request.getRequestDispatcher("/result/handle-postResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
