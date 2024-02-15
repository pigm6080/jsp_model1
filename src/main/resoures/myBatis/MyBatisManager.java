package myBatis;

import java.io.IOException;

import java.io.InputStream;

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
	
	//싱글톤 처리 이것으로 인해 sqlSessionFactory의 객체 안에 싱들톤처리된 값이 생성된다.
	private MyBatisManager() {
		
		//설정파일
		String resoures = "myBatis/myBatis-config.xml";
		
		InputStream inputStream = null;

		    try {
		      //Resources.getReSourceAsStream myBatis-config.xml파일을 로드한다. 이파일은 데이터베이스 연결정보 및 매퍼 파일 경로 정의
		      inputStream = Resources.getResourceAsStream(resoures);
		      //SqlSessionFactoryBuilder을 통헤 sqlSessionFactory 인스턴스 생성한다.
		      sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		    } catch (IOException e) {
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
	

