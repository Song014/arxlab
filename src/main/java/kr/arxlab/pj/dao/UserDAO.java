package kr.arxlab.pj.dao;

import kr.arxlab.pj.dto.UserDTO;

public interface UserDAO {

	public String loginCheck(UserDTO dto);
}
