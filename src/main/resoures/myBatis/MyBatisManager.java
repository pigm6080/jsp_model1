package myBatis;

import java.io.IOException;
import java.io.InputStream;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisManager {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	public static SqlSessionFactory getSqlSessionFactory() {
		if(sqlSessionFactory == null) {
			new MyBatisManager();
		}
		return sqlSessionFactory;
	}
	
	//싱글톤 처리
	private MyBatisManager() {
		String resoures = "myBatis/mybatis-config.xml";
		
		InputStream inputStream = null;
		
		try {
			inputStream = Resources.getResourceAsStream(resoures);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
		      try {
		          inputStream.close();
		        } catch (IOException e) {
		          e.printStackTrace();
		        }
		}
	}
	
}
