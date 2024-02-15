package srv;

import java.util.ArrayList;
import java.util.List;

import dao.MenuMapper;
import model.menuDTO;
import model.menuVO;

public class MenuServicelmpl implements MenuService{
	
	private MenuMapper menuDao;
	
	public MenuServicelmpl(MenuMapper menuDao) {
		this.menuDao = menuDao;
	}

	@Override
	public List<menuDTO> findAll() {
		System.out.println("Here1!");
		
		List<menuVO> daoList = menuDao.findAll();
		List<menuDTO> list = null;
		
		System.out.println("Here!");
		if(daoList != null) {
			list = new ArrayList<menuDTO>();
			
			for (menuVO vo : daoList) {
				
				menuDTO dto = new menuDTO();
				dto.setCnt(vo.getCnt());
				dto.setMenuid(vo.getMenuid());
				dto.setName(vo.getName());
				dto.setPrice(vo.getPrice());
				System.out.println(dto);
				
				list.add(dto);
			}//for
			
		}// if
		return list;
	}

	@Override
	public int save(menuDTO dto) {
		
		menuVO vo = new menuVO();
		
		vo.setName(dto.getName());
		vo.setPrice(dto.getPrice());
		
		return 0;
	}
	
	


}
