package com.lqz.domain;

public class Comment {
	int commentId;
	int postId;
	String comment;
	String userName;
	String datetime;
	
	public Comment() {
		super();
	}
	public Comment(int postId, String comment, String userName, String datetime) {
		super();
		this.postId = postId;
		this.comment = comment;
		this.userName = userName;
		this.datetime = datetime;
	}
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", postId=" + postId + ", comment=" + comment + ", userName="
				+ userName + ", datetime=" + datetime + "]";
	}
}
