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
	
	//sqlSEssionFactory 객체에 MyBatisManger에서 생성한 객체를 받아온다.
	private SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
	//sqlSessionFactory에서 sqlSession객체를 받아온다. openSession(false)로 함으로 autocommit 방지
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
