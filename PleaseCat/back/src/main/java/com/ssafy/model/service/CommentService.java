package com.ssafy.model.service;

import java.util.List; 

import com.ssafy.model.dto.comment;

public interface CommentService {
	public comment searchComment(int no);
	public List<comment> searchCommentUser(int no);
	public List<comment> searchCommentPost(int no);
	public void insertComment(int post_no, int user_no, String comment_content);
	public void updateComment(comment comment);
	public void deleteComment(int no);
}
