package dao;

import java.util.Map;

import model.userDTO;
import model.userVO;

//UserMapper.xml이랑 직접적으로 연결해서 갖고오는 역할을 한다.
public interface UserMapper {
	
	userVO getOne(Map<String, String> loginInfo);

}
