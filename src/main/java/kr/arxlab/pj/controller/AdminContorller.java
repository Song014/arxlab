package kr.arxlab.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminContorller {

	/*
	 * 어드민 페이지 
	 *  
	 * 	게시굴 CRUD
	 * 	네비게시연 관리기능
	 * 
	 *  구글 분석기능
	 */
	
	// 어드민 화면
	@RequestMapping(value = "/admin")
	public String adminPage() {
		
		return "admin";
	}
}
