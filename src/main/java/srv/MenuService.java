package srv;

import java.util.List;

import model.menuDTO;
import model.menuVO;

public interface MenuService {
	
	List<menuDTO> findAll();
	
	int save(menuDTO dto);
}
