package com.mycompany.app.emp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mycompany.app.emp.EmpDTO;

//DAO 역할을 하는 클래스
//실제로는 DB와 연동해야 하겠지만 여기에서는 연동했다고 가정하고 진행
@Repository
public class EmpDAOImpl implements EmpDAO{

	//필드
	
	//기본생성자
	EmpDAOImpl(){System.out.println("EmpDAOImpl() 기본생성자야");}
	
	//메서드
	//사원상세조회
	@Override
	public EmpDTO getEmpDetail(String empId) {
		EmpDTO empDTO = new EmpDTO("hongId","홍길동","1234",3500);
		return empDTO;
	}
	
	//사원이름목록조회
	@Override
	public List<String> getEmpNameList(){
		List<String> list = new ArrayList<String>();
		list.add(new String("홍길동"));
		list.add(new String("김길동"));
		list.add(new String("이길동"));
		list.add(new String("박길동"));
		return list;
	}

	//사원정보목록조회
	@Override
	public List<EmpDTO> getEmpList() {
		List<EmpDTO> empList = new ArrayList<EmpDTO>();
		empList.add(new EmpDTO("hongid","홍길동","1",3000));
		empList.add(new EmpDTO("kid","김길동","12",3100));
		empList.add(new EmpDTO("lid","이길동","123",3500));
		empList.add(new EmpDTO("pid","박길동","1234",3900));
		return empList;
	}
	
	
}



