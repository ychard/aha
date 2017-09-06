package org.lanqiao.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.lanqiao.dao.EmpMapper;
import org.lanqiao.entity.Emp;

public class EmpMapperTest {

	private static SqlSessionFactory factory = null;
	static{
		String resource = "mybatis-conf.xml";
		try {
			InputStream in  = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetEmpByDeptno() {
		SqlSession session = factory.openSession();
		EmpMapper mapper = session.getMapper(EmpMapper.class);
		Emp emp = mapper.getEmpByDeptno(7369);
		System.out.println(emp.toString());
	}

}
