package dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.userVO;

public class UserMapperDAO implements UserMapper{
	
	 SqlSession sqlSession;

	 public UserMapperDAO(SqlSession sqlSession) {
		 this.sqlSession = sqlSession;
	 }
	 
	 public UserMapper mp() {
		 return sqlSession.getMapper(UserMapper.class);
	 }
	 
	@Override
	public userVO getOne(Map<String, String> loginInfo) {
		// TODO Auto-generated method stub
		return mp().getOne(loginInfo);
		
	}
}
