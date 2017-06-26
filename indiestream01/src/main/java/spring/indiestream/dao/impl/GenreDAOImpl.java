package spring.indiestream.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.indiestream.dao.GenreDAO;

public class GenreDAOImpl implements GenreDAO{
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<String> selectBymemberId(String memberId) {
		return sqlSession.selectList("genreMapper.selectBymemberId",memberId);
	}

}
