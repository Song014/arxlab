package kr.arxlab.pj.service;

import javax.servlet.http.HttpSession;

import kr.arxlab.pj.dto.UserDTO;

public interface AdminService {

	String loginCheck(UserDTO dto, HttpSession session);

	
}
