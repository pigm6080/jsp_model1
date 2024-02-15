package srv;

import java.util.Map;

import model.userDTO;

public interface UserService {
	
	userDTO getOne(Map<String, String> loginInfo);
	
}
