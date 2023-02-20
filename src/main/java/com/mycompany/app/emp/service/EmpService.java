package com.mycompany.app.emp.service;

import java.util.List;

import com.mycompany.app.emp.EmpDTO;

public interface EmpService {
	//상수
	//추상메서드
	//사원상세보기  select empid,ename,pwd,sal from emp where empid='hongid';
	public abstract EmpDTO getEmpDetail(String empId);
	
	//사원이름목록조회 select ename from emp;
	public abstract List<String> getEmpNameList();
	
	//사원목록조회  select  empid,ename,pwd,sal  from emp;
	public abstract List<EmpDTO> getEmpList();
}





