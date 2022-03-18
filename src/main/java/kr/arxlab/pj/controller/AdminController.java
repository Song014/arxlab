package kr.arxlab.pj.controller;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.arxlab.pj.dto.UserDTO;
import kr.arxlab.pj.service.AdminService;

@Controller
/* @RequestMapping("/admin") */
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Autowired
	private AdminService aService;

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "admin";
	}
	// 어드민페이지
	@RequestMapping(value = "/admin/login", method = RequestMethod.GET)
	public ModelAndView loginCheck(@ModelAttribute UserDTO dto, HttpSession session) {
		String name = aService.loginCheck(dto, session);  
		 ModelAndView mav = new ModelAndView();
		  if (name != null) { // 로그인 성공 시
		   mav.setViewName("/"); // 뷰의 이름
		   } else { // 로그인 실패 시
		     mav.setViewName("/admin"); 		
		     mav.addObject("message", "error");
		     }
		  	System.out.println(mav);
		     return mav;
		   }

	// 로그인


	// 카테고리관리기능
}
