package kr.arxlab.pj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductAndServiceController {

	
	// 3.제품과 서비스
	
	@RequestMapping(value = "/productandservice", method = RequestMethod.GET)
	public String productandservice () {
		
		return "ps";
	}
}
