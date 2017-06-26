package spring.indiestream.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public interface GenreDAO {
	void setSqlSession(SqlSession sqlSession);
	List<String> selectBymemberId(String memberId);
}
