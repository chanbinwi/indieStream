package spring.indiestream.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.indiestream.domain.SnsBoardVO;

public interface SnsBoardDAO {

	void setSqlSession(SqlSession sqlSession);
	List<SnsBoardVO> snsSelectAll();
	SnsBoardVO snsSelectOne(String no);
	int snsInsert(SnsBoardVO snsVO);
	int snsUpdate(SnsBoardVO snsVO);
	int snsDelete(String no);
	
}
