package com.lqz.web.postServlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lqz.DAO.impl.PostDAOimpl;

public class UpdatePostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String postId = request.getParameter("postId").toString();
		System.out.println(postId);
		String title = request.getParameter("title").toString();
		String context = request.getParameter("context").toString();
		PostDAOimpl postDAOimpl = new PostDAOimpl();
		try {
			postDAOimpl.alterPost(Integer.valueOf(postId), title, context);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("msg", "恭喜你，文章修改成功！");
		request.getRequestDispatcher("/result/handle-postResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
