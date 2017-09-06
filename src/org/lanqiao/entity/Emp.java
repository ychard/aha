package org.lanqiao.entity;

import java.util.Date;

public class Emp {
	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hiredate;
	private Integer sal;
	private Integer comm;
	private Dept dept;//部门编号(外键)
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public Integer getComm() {
		return comm;
	}
	public void setComm(Integer comm) {
		this.comm = comm;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Emp() {
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer empno, String ename, String job, Integer mgr,
			Date hiredate, Integer sal, Integer comm, Dept dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.dept = dept;
	}
}
