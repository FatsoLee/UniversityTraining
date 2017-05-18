package com.lqz.DAO.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.lqz.domain.Comment;
import com.lqz.util.C3P0Util;

public class CommentDaoImpl {
	public void insertComment(Comment comment) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("INSERT INTO comment(postId, comment, userName, datetime) VALUES(?,?,?,?)",
				comment.getPostId(), comment.getComment(), comment.getUserName(), comment.getDatetime());
	}

	public void deleteComment(int commentId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("delete from comment where commentId=?", commentId);
	}
	
	public void deleteCommentByPostId(int postId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		qr.update("delete from comment where postId=?", postId);
	}

	public List<Comment> findAllComment() throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from comment", new BeanListHandler<Comment>(Comment.class));
	}

	public List<Comment> fingCommentByPostId(int postId) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Util.getDataSource());
		return qr.query("select * from comment where postId=?", new BeanListHandler<Comment>(Comment.class), postId);
	}
}
