package kr.arxlab.pj.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.arxlab.pj.dto.UserDTO;

@Repository
public class UserDAOImp implements UserDAO{

	@Inject
	SqlSession sqlSession;
	
	@Override
	public String loginCheck(UserDTO dto) {
		return sqlSession.selectOne("loginCheck", dto.getUser_name());
	}

}
