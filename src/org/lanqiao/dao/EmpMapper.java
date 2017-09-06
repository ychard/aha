package org.lanqiao.dao;

import org.lanqiao.entity.Emp;

public interface EmpMapper {
	public Emp getEmpByDeptno(Integer empno);
}
