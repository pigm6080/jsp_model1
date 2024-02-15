package dao;

import java.util.Map;

import model.userDTO;
import model.userVO;

public interface UserMapper {
	
	
	userVO getOne(Map<String, String> loginInfo);

}
