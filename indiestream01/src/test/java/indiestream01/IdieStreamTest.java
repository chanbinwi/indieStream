package indiestream01;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import spring.indiestream.dao.GenreDAO;
import spring.indiestream.dao.impl.GenreDAOImpl;

public class IdieStreamTest {

	public static void main(String[] args) throws IOException {
		SqlSession session = null;
		//==> TestUtil �� getSqlSessionFactory()�� �̿� SqlSessionFactory instance GET
		SqlSessionFactory factory = getSqlSessionFactory();
		session=factory.openSession();
		
			
		//==> MyBatisUserDAOImpl10 ���� �� sqlMapClient ��ü setter injection
		GenreDAO dao = new GenreDAOImpl();
		dao.setSqlSession(session);
		
		for(String genre:dao.selectBymemberId("aa"))
			System.out.println(genre);
	}

	public static SqlSessionFactory getSqlSessionFactory() throws IOException{
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		return factory;
	}	
	
}
