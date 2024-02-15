package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import model.menuVO;

public class MenuMapperDAO implements MenuMapper {
	
	SqlSession sqlSession;
	
	public MenuMapperDAO(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	private MenuMapper mp() {
		return sqlSession.getMapper(MenuMapper.class);
	}

	@Override
	public List<menuVO> findAll() {
		// TODO Auto-generated method stub
		return mp().findAll();
	}

	@Override
	public int save(menuVO vo) {
		
		int result = 0;
		
		try {
			result = mp().save(vo);
			sqlSession.commit();
		}catch(Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		
		}
		return result;
	}

}
