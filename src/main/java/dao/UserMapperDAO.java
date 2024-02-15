package dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import model.userVO;

public class UserMapperDAO implements UserMapper{
	
	 SqlSession sqlSession;

	 //생서자를 통해 Factory에서 받아온 sqlSession값을 설정해준다.
	 public UserMapperDAO(SqlSession sqlSession) {
		 this.sqlSession = sqlSession;
	 }
	 
	 public UserMapper mp() {
		 //MyBatis.xml이랑 Mapper인터페이스랑 직접적으로 연결해주는역할을한다.
		 return sqlSession.getMapper(UserMapper.class);
	 }
	 
	@Override
	public userVO getOne(Map<String, String> loginInfo) {
		// TODO Auto-generated method stub
		return mp().getOne(loginInfo);
		
	}
}
