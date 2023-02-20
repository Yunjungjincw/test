package com.mycompany.app.emp.repository;

import java.util.List;

import com.mycompany.app.emp.EmpDTO;

public interface EmpDAO {
 // 접근제어자 abstract 메서드명(매개변수); //추상메서드
	//사원상세보기
	public abstract EmpDTO getEmpDetail(String empId);
	
	//사원이름목록조회
	public List<String> getEmpNameList();
	
	//사원정보조회
	public List<EmpDTO> getEmpList();
}









