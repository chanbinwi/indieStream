package spring.indiestream.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.indiestream.dao.SnsBoardDAO;
import spring.indiestream.domain.SnsBoardVO;

public class SnsBoardDAOImpl implements SnsBoardDAO{

	private SqlSession sqlsession;
	
	@Override
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlsession = sqlSession;
	}

	@Override
	public List<SnsBoardVO> snsSelectAll() {
		
		return sqlsession.selectList("snsMapper.snsSelectAll");
	}

	@Override
	public SnsBoardVO snsSelectOne(String no) {
		
		return sqlsession.selectOne("snsMapper.snsSelectOne",no);
	}

	@Override
	public int snsInsert(SnsBoardVO snsVO) {
		
		return sqlsession.insert("snsMapper.snsInsert", snsVO);
	}

	@Override
	public int snsUpdate(SnsBoardVO snsVO) {
		
		return sqlsession.update("snsMapper.snsUpdate",snsVO);
	}

	@Override
	public int snsDelete(String no) {
		
		return sqlsession.delete("snsMapper.snsDelete",no);
	}

}
