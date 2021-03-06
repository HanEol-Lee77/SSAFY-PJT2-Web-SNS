package com.ssafy.controller;

import java.util.HashMap;    
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.model.dto.comment;
import com.ssafy.model.service.DetailPostPageService;
import com.ssafy.model.service.CommentService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = {"*"}, maxAge = 6000)
@RequestMapping("/api/detailPostPage")
@RestController
public class DetailPostPageRestController {
	
	@Autowired
	private DetailPostPageService DetailPostPageService;
	
	@ExceptionHandler
	public ResponseEntity<Map<String, Object>> handle(Exception e){
		return handleFail(e.getMessage(), HttpStatus.OK);
	}
	
	public ResponseEntity<Map<String, Object>> handleSuccess(Object data){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("state", "ok");
		resultMap.put("data", data);
		return new ResponseEntity<Map<String, Object>>(resultMap, HttpStatus.OK);
	}
	
	public ResponseEntity<Map<String, Object>> handleFail(Object data, HttpStatus state){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("state", "fail");
		resultMap.put("data", data);
		return new ResponseEntity<Map<String,Object>>(resultMap, state); 
	}
	
	@ApiOperation("게시글 관리번호로 댓글 정보를 찾는다.")
	@GetMapping("/searchDetailPostPage/{Post_no}")
	public ResponseEntity<Map<String, Object>> searchDetailPostPage(@RequestParam int Post_no) throws Exception{
		return handleSuccess(DetailPostPageService.searchDetailPostPage(Post_no));
	}
	
	@ApiOperation("게시글 관리번호로 댓글 정보를 찾는다.")
	@GetMapping("/searchDetailPostInfo/{Post_no}")
	public ResponseEntity<Map<String, Object>> searchDetailPostInfo(@RequestParam int Post_no) throws Exception{
		return handleSuccess(DetailPostPageService.searchDetailPostInfo(Post_no));
	}
}
