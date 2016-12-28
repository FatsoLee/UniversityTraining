package com.lqz.DAO.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.lqz.domain.Post;
import com.lqz.util.C3P0Util;

public class PostDAOimpl {
	public void insertPost(Post post) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("INSERT INTO post(title,context,userName,clickNumber,replyNumber,date) VALUES(?,?,?,?,?,?)",
				post.getTitle(), post.getContext(), post.getUserName(), post.getClickNumber(), post.getReplyNumber(),
				post.getDate());
	}

	public void deletePost(int postId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("delete from post where postId=?", postId);
	}

	public List<Post> findAllPost() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from post", new BeanListHandler<Post>(Post.class));
	}

	public Post findPostById(int postId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from post where postId=?", new BeanHandler<Post>(Post.class), postId);
	}
	
	public List<Post> findPostByUserName(String userName) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from post where userName=?", new BeanListHandler<Post>(Post.class), userName);
	}
	
	public void alterPostLastTime(int postId, String datetime) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("update post set lastReplyTime=? where postId=?", datetime, postId);
	}
	
	public void alterPost(int postId, String title, String context) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("update post set title=?,context=? where postId=?", title, context, postId);
	}
}
