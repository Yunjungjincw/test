package com.mycompany.app.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.app.emp.EmpDTO;
import com.mycompany.app.emp.repository.EmpDAO;
import com.mycompany.app.emp.repository.EmpDAOImpl;

//Service역할을 하는 클래스이다
@Service 
public class EmpServiceImpl implements EmpService{
	//필드
	
	//자동주입
	//<beans:bean class="com.mycom.app.emp.repository.EmpDAOImpl" id="empDAO"/>
	@Autowired
	private EmpDAOImpl empDAO;
	
	//기본생성자
	EmpServiceImpl(){ System.out.println("EmpServiceImpl()의 기본생성자야~"); }
	
	//메서드
	
	//사원상세보기
	@Override
	public EmpDTO getEmpDetail(String empId) {
		EmpDTO empDTO = null;
		empDTO = empDAO.getEmpDetail(empId);
		return empDTO;
	}
	
	//사원이름목록조회
	@Override
	public List<String> getEmpNameList() {
		return empDAO.getEmpNameList();
	}
	
	//사원목록조회 
	@Override
	public List<EmpDTO> getEmpList() {
		return empDAO.getEmpList();
	}
	
}








