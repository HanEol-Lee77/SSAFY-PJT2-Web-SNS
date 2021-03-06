package com.ssafy.model.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.ssafy.model.dto.likes;

@Repository
@Mapper
public interface LikesDao {
	//public likes searchLikes(int user_no, int post_no);
	public likes searchLikes(HashMap<String, Object> map);
	public void insertLikes(HashMap<String, Object> map);
	public void deleteLikes(HashMap<String, Object> map);
	public List<likes> searchAllLikesOfUser(int user_no);
	public List<likes> searchAllLikesOfPost(int post_no);
	public void readAlarm(int post_no);
}
