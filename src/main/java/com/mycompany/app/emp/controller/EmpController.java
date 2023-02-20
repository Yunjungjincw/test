package com.mycompany.app.emp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycompany.app.emp.EmpDTO;
import com.mycompany.app.emp.service.EmpServiceImpl;

//사원관리관련 컨트롤러
//컨트롤러클래스임을 알려주는 애너테이션 @Controller
@Controller
@RequestMapping("emp")  //클래스 수준의  @RequestMapping
public class EmpController {
	
	//필드
	//의존관계 설정시 사용. 객체를 자동 주입. Spring 종속 애너테이션.org.springframework.beans.factory.annotation.Autowired
	//<beans:bean class="com.mycom.app.emp.service.EmpServiceImpl" id="empService"/>
	@Autowired 
	private EmpServiceImpl empService;
	
	//생성자
	//메서드
	
	//사원상세보기
	//요청메서드 @RequestMapping를 선언하면 된다
	@RequestMapping(value="empDetail.do",method=RequestMethod.GET) //메서드수준의 @RequestMapping
	public String getEmpDetail(HttpServletRequest request,Model model) {
		//1.파라미터받기
		String empId=request.getParameter("empId");
		
		//2.비즈니스로직수행->Service->DAO
		EmpDTO empDTO = empService.getEmpDetail(empId);
		
		//3.Model
		model.addAttribute("empDTO", empDTO);
		
		//4.view
		return "emp/empDetail";
	}
	
	//사원이름목록조회
	//요청주소   http://ip주소:포트번호/컨패/emp/empNameList
	@RequestMapping("empNameList")
	public String getEmpNameList(Model model) {
		//1.파라미터받기
		//2.비즈니스로직<->Service<->DAO<->DB
		List<String> nameList = empService.getEmpNameList();
		//3.Model
		model.addAttribute("nameList", nameList);
		//4.View
		return "emp/empNameList";
	}
	
	//사원목록조회
	//요청주소  http://localhost:포트번호/컨패/emp/empList
	//view   "/WEB-INF/views/emp/empList.jsp"
	@RequestMapping(value="empList")
	public String getEmpList(Model model) {
		List<EmpDTO> emplist = empService.getEmpList();
		model.addAttribute("emplist",emplist);
		return "emp/empList";
	}
	

}









