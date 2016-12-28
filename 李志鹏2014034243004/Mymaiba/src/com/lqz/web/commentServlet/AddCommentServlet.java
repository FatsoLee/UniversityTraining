package com.lqz.web.commentServlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lqz.DAO.impl.CommentDaoImpl;
import com.lqz.DAO.impl.PostDAOimpl;
import com.lqz.domain.Comment;
import com.lqz.domain.User;

public class AddCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	
		int postId = Integer.valueOf(request.getParameter("postId").toString());
		String commentText = request.getParameter("comment").toString();
		String userName = ((User)request.getSession().getAttribute("user")).getAccount();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(new Date());
		
		Comment comment = new Comment(postId, commentText, userName, dateString);
		CommentDaoImpl commentImpl = new CommentDaoImpl();
		PostDAOimpl postDAOimpl = new PostDAOimpl();
		try {
			postDAOimpl.alterPostLastTime(postId, dateString);
			commentImpl.insertComment(comment);
			request.setAttribute("msg", "恭喜你，评论成功！");
		} catch (SQLException e) {
			request.setAttribute("msg", "数据库插入异常");
			e.printStackTrace();
		}
		request.getRequestDispatcher("/result/handle-postResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
