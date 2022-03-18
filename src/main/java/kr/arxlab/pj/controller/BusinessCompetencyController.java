package kr.arxlab.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BusinessCompetencyController {
	
	/*
	*	2. 사업역량
	*    * 수행사업
	*        * 용역
	*    * 보유장비
	*        * 드론 
	*           * 고정익
	*           * 회전익
	*           * 특수장비
	*        * 페이로드
	*    * 조직구성
	*        * 인력1
	*        * 인력2
    */
	
	// 수행 사업
	@RequestMapping(value = "/business", method = RequestMethod.GET)
	public String business () {
		
		return "business";
	}
	
	// 보유장비
	@RequestMapping(value = "/equipment", method = RequestMethod.GET)
	public String equipment () {
		
		return "equipment";
	}
	// 조직구성
	@RequestMapping(value = "/organization", method = RequestMethod.GET)
	public String organization () {
		
		return "organization";
	}
}
