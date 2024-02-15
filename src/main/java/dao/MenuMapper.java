package dao;

import java.util.List;

import model.menuVO;

public interface MenuMapper {
	
	List<menuVO> findAll();
	
	int save(menuVO vo);
}
