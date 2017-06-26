package indiestream01;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import spring.indiestream.dao.GenreDAO;
import spring.indiestream.dao.HashtagDAO;
import spring.indiestream.dao.ImageDAO;
import spring.indiestream.dao.SnsBoardDAO;
import spring.indiestream.dao.impl.GenreDAOImpl;
import spring.indiestream.dao.impl.HashtagDAOImpl;
import spring.indiestream.dao.impl.ImageDAOImpl;
import spring.indiestream.dao.impl.SnsBoardDAOImpl;
import spring.indiestream.domain.HashtagVO;
import spring.indiestream.domain.ImageVO;
import spring.indiestream.domain.SnsBoardVO;

public class IdieStreamTest {

	public static void main(String[] args) throws IOException {
		SqlSession session = null;
		//==> TestUtil �� getSqlSessionFactory()�� �̿� SqlSessionFactory instance GET
		SqlSessionFactory factory = getSqlSessionFactory();
		session=factory.openSession();
		
			
		//==> MyBatisUserDAOImpl10 ���� �� sqlMapClient ��ü setter injection
		/*GenreDAO dao = new GenreDAOImpl();
		dao.setSqlSession(session);
		
		for(String genre:dao.selectBymemberId("aa"))
			System.out.println(genre);*/
		
		//SnsBoardDAO dao = new SnsBoardDAOImpl();
		//dao.setSqlSession(session);
		//=====snsboard
		//dao.snsInsert(new SnsBoardVO(7, "1234", "today", "content", "vu"));
		//SnsBoardVO vo = dao.snsSelectOne("1");
		//System.out.println(dao.snsDelete("1"));
		//System.out.println(dao.snsUpdate(new SnsBoardVO(1, "ㅇㅇ", "123", "업데이트하는중", "비디오도 바꿔")));
		//List<SnsBoardVO> list = dao.snsSelectAll();
		//System.out.println(list);
		
		//=====image
		/*ImageDAO dao = new ImageDAOImpl();
		dao.setSqlSession(session);*/
		
		//System.out.println(dao.imageInsert(new ImageVO(2, 2, "1234", "맘대로1")));
		//List<ImageVO> list = dao.imageSelectAll();
		//System.out.println(list);
		
		//System.out.println(dao.imageSelectAll("2"));
		//System.out.println(dao.imageDeleteOne(new ImageVO(2, 2, "1234", "맘대로1")));
		//System.out.println(dao.imageDeleteAll(new ImageVO(2, 2, "1234", "맘대로1")));
		
		//=====hash
		HashtagDAO dao = new HashtagDAOImpl();
		dao.setSqlSession(session);
		/*List<String> list =new ArrayList<String>();
		list.add("해시태그1");
		list.add("해시태그2");
		list.add("해시태그3");
		
		dao.hashSnsInsert(new HashtagVO(2, list, "1234"));*/
		List<HashtagVO> list=dao.hashSnsSelectFromOnePost("2");
		System.out.println(list);
		session.commit();
		
		//System.out.println(vo);
	}

	public static SqlSessionFactory getSqlSessionFactory() throws IOException{
		Reader reader = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		return factory;
	}	
	
}
