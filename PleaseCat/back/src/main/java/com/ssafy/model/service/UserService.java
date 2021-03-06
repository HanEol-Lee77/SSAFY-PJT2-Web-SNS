package com.ssafy.model.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ssafy.model.dto.alarm;
import com.ssafy.model.dto.user;

public interface UserService  {
	public user searchUser(int no) throws Exception ;
	public void insertUser(MultipartFile userImg, user User) throws Exception ;
	public void updateUser(user User);
	public void deleteUser(int no);
	public List<user> searchAllUser();
	public user searchUserEmail(String user_email);
	public String login(user User);
	public String checkToken(String token);
	public int findNextUserNo();
	public List<alarm> searchAlarm(int user_no);
	public String readAlarm(int post_no);
}
