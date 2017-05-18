package com.lqz.domain;

public class Post {

	private int postId;
	private String title;
	private String context;
	private String userName;
	private int clickNumber;
	private int replyNumber;
	private String date;
	private String lastReplyTime;

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getClickNumber() {
		return clickNumber;
	}

	public void setClickNumber(int clickNumber) {
		this.clickNumber = clickNumber;
	}

	public int getReplyNumber() {
		return replyNumber;
	}

	public void setReplyNumber(int replyNumber) {
		this.replyNumber = replyNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLastReplyTime() {
		return lastReplyTime;
	}

	public void setLastReplyTime(String lastReplyTime) {
		this.lastReplyTime = lastReplyTime;
	}

	@Override
	public String toString() {
		return "Post [postId=" + postId + ", title=" + title + ", context=" + context + ", userName=" + userName
				+ ", clickNumber=" + clickNumber + ", replyNumber=" + replyNumber + ", date=" + date
				+ ", lastReplyTime=" + lastReplyTime + "]";
	}

}
