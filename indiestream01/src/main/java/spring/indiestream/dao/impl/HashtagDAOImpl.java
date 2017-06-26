package spring.indiestream.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.indiestream.dao.HashtagDAO;
import spring.indiestream.domain.HashtagVO;

public class HashtagDAOImpl implements HashtagDAO{

	private SqlSession sqlsession;
	
	@Override
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlsession = sqlSession;
	}

	@Override
	public int hashSnsInsert(HashtagVO hashtagVO) {
		
		return sqlsession.insert("hashMapper.hashSnsInsert", hashtagVO);
	}

	@Override
	public List<HashtagVO> hashSnsSelectFromOnePost(String no) {
		
		return sqlsession.selectList("hashMapper.hashSnsSelectFromOnePost", no);
	}

}
