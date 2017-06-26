package spring.indiestream.dao;



import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.indiestream.domain.HashtagVO;


public interface HashtagDAO {

	void setSqlSession(SqlSession sqlSession);
	int hashSnsInsert(HashtagVO hashtagVO);
	List<HashtagVO> hashSnsSelectFromOnePost(String no);
	
}
