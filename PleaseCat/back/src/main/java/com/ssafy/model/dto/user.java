package com.ssafy.model.dto;


//public class user implements UserDetails {
public class user{
	private int user_no; 
	private String user_email; 
	private String user_pw; 
	private String user_id; 
	private String user_image; 
	private String user_desc;
	private int count_followers;
	private int count_followings_user;
	private int count_followings_cat;
	private int count_posts; 
	private int count_likes; 
	public user() {}
	public user(int user_no, String user_email, String user_pw, String user_id) {
		super();
		this.user_no = user_no;
		this.user_email = user_email;
		this.user_pw = user_pw;
		this.user_id = user_id;
	}	
	public user(int user_no, String user_email, String user_pw, String user_id, String user_image, String user_desc) {
		super();
		this.user_no = user_no;
		this.user_email = user_email;
		this.user_pw = user_pw;
		this.user_id = user_id;
		this.user_image = user_image;
		this.user_desc = user_desc;
	}
	public user(int user_no, String user_email, String user_pw, String user_id, String user_image, String user_desc,
			int count_followers, int count_followings_user, int count_followings_cat, int count_posts,
			int count_likes) {
		super();
		this.user_no = user_no;
		this.user_email = user_email;
		this.user_pw = user_pw;
		this.user_id = user_id;
		this.user_image = user_image;
		this.user_desc = user_desc;
		this.count_followers = count_followers;
		this.count_followings_user = count_followings_user;
		this.count_followings_cat = count_followings_cat;
		this.count_posts = count_posts;
		this.count_likes = count_likes;
	}
	public int getUser_no() {
		return user_no;
	}
	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_pw() {
		return user_pw;
	}
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_image() {
		return user_image;
	}
	public void setUser_image(String user_image) {
		this.user_image = user_image;
	}
	public String getUser_desc() {
		return user_desc;
	}
	public void setUser_desc(String user_desc) {
		this.user_desc = user_desc;
	}
	public int getCount_followers() {
		return count_followers;
	}
	public void setCount_followers(int count_followers) {
		this.count_followers = count_followers;
	}
	public int getCount_posts() {
		return count_posts;
	}
	public void setCount_posts(int count_posts) {
		this.count_posts = count_posts;
	}
	public int getCount_likes() {
		return count_likes;
	}
	public void setCount_likes(int count_likes) {
		this.count_likes = count_likes;
	}
	public int getCount_followings_user() {
		return count_followings_user;
	}
	public void setCount_followings_user(int count_followings_user) {
		this.count_followings_user = count_followings_user;
	}
	public int getCount_followings_cat() {
		return count_followings_cat;
	}
	public void setCount_followings_cat(int count_followings_cat) {
		this.count_followings_cat = count_followings_cat;
	}
	@Override
	public String toString() {
		return "{ user_no: \'" + user_no + "\', user_email: \'" + user_email + "\', user_pw: \'" + user_pw + "\', user_id: \'"
				 + user_id + "\', user_image: \'" + user_image + "\', user_desc: \'" + user_desc
				 + "\', count_followers: \'" + count_followers + "\', count_posts: \'" + count_posts
				 + "\', count_likes: \'" + count_likes+ "\', count_followings_user: \'" + count_followings_user+ 
				 "\', count_followings_cat: \'" + count_followings_cat+ "\'}";
	}	
}
