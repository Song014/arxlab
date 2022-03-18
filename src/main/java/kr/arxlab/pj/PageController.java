package kr.arxlab.pj;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PageController {
	
	private static final Logger logger = LoggerFactory.getLogger(PageController.class);
	
	// 홈
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "index";
	}
	// 사업역량
	@RequestMapping(value = "/businesscompetency", method = RequestMethod.GET)
	public String businesscompetency(Locale locale, Model model) {
		
		
		return "businesscompetency";
	}
	// 제품과 서비스
	@RequestMapping(value = "/productAndService", method = RequestMethod.GET)
	public String productAndService(Locale locale, Model model) {
		
		
		return "productAndService";
	}
	// 뉴스
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public String news(Locale locale, Model model) {
		
		
		return "news";
	}
	
	
}
