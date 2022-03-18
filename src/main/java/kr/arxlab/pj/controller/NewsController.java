package kr.arxlab.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewsController {

	/*
	 * 4. 뉴스
	 *	* 보도자료
     *	* 홍보자료
	 */
	
	// 보도자료
	@RequestMapping(value = "/newsrelease", method = RequestMethod.GET)
	public String newsrelease () {
		
		return "nr";
	}
	
	// 홍보자료
	@RequestMapping(value = "/publicrelations", method = RequestMethod.GET)
	public String publicrelations () {
		
		return "pr";
	}
	
	}
