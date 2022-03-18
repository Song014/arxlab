package kr.arxlab.pj.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.arxlab.pj.dao.UserDAO;
import kr.arxlab.pj.dto.UserDTO;

@Service
public class AdminServiceImp implements AdminService{

	
	@Autowired
	private UserDAO userDAO;
	
	@Override
	public String loginCheck(UserDTO dto, HttpSession session) {
		String name = userDAO.loginCheck(dto);
		 if (name != null) { // 세션 변수 저장
		  session.setAttribute("user_name", dto.getUser_name());
		  session.setAttribute("name", name);
		}
			
		return name;
	}

}
