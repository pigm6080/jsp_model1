package srv;

import java.util.Map;

import dao.UserMapper;
import model.userDTO;
import model.userVO;

public class UserServicelmpl implements UserService{
	
	private UserMapper userDAO;
	//팩토리에서받아온 DAO를 생성자를 통해 현재 userDAO객체로 초기화
	public UserServicelmpl(UserMapper userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public userDTO getOne(Map<String, String> loginInfo) {
		
		System.out.println(loginInfo.get("userid"));
		System.out.println(loginInfo.get("password"));
		
		userVO vo = userDAO.getOne(loginInfo);
		
		userDTO dto = null;
		
		
		if(vo != null) {
			dto = new userDTO();
			dto.setUserid(vo.getUserid());
			dto.setPassword(vo.getPassword());
			dto.setName(vo.getName());
		}
		System.out.println("dto ="+ dto);
		System.out.println("vo ="+ vo);
		return dto;
	}

	
}
