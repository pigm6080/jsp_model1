package ioc;

import org.apache.ibatis.session.SqlSession;

import org.apache.ibatis.session.SqlSessionFactory;

import dao.MenuMapper;
import dao.MenuMapperDAO;
import dao.UserMapper;
import dao.UserMapperDAO;
import myBatis.MyBatisManager;
import srv.MenuService;
import srv.MenuServicelmpl;
import srv.UserService;
import srv.UserServicelmpl;

public enum Factory {
	
	INSTANCE;
	
	private SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
	private SqlSession sqlSession = sqlSessionFactory.openSession(false);
	
	private MenuMapper menuDao = new MenuMapperDAO(sqlSession);
	private MenuService menuSrv = new MenuServicelmpl(menuDao);
	public MenuService getMenuSrv() {
		return menuSrv;
	}
	
	private UserMapper userDAO = new UserMapperDAO(sqlSession);
	private UserService userSrv = new UserServicelmpl(userDAO);
	public UserService getUserSrv() {
		return userSrv;
	}
	
	
	
}
