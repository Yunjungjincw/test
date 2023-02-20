package com.mycompany.member.controller;

import java.util.List;

import javax.servlet.RequestDispatcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.member.domain.Member;
import com.mycompany.member.service.MemberService;

//회원관련 컨트롤러
@Controller
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired		
	private MemberService memberService;
	
	
	//회원등록폼 보여주기
	@GetMapping("/member/add")
	public String requestAddMemberForm(@ModelAttribute("NewMember") Member member) {
		return "member/addMember";
	}
	
	//회원등록처리
	@PostMapping("/member/add")
	public String submitAddMember(@ModelAttribute("NewMember") Member member) {
		logger.info(member.toString());
		memberService.setNewMember(member);
		return "test/resultView";
	}
	
	
	//회원Id로 상세회원정보 조회
	@GetMapping("/member/info")
	public String requestMemberById(@RequestParam("memberid") String id, Model model) {
		
		Member member = memberService.getMemberById(id);
		model.addAttribute("member",member);
		return "member/member/info";
	}
	
	
	//회원목록조회
	@GetMapping("/member/list")
	public ModelAndView requestAllMemberList(ModelAndView mv) {
		//public List<Member> getAllMemberList() 호출 예정
		List<Member> memberList=memberService.getAllMemberList();
		mv.addObject("memberList", memberList); 	//jsp로 객체 바인딩하는건가?
		mv.setViewName("member/memberList");	//뷰를 지정
		return mv;
	}
	
	
	//비밀번호수정폼 요청
	//get방식
	//요청주소 ~ 컨페/member/update
	@GetMapping("/member/update")
	public ModelAndView requestModiMemberForm(@ModelAttribute("UpdateMember") Member member, 
									@RequestParam("memberid") String id, ModelAndView mv) {
		logger.info(id);
		
		//수정폼에는 수정하고자 하는 특정회원의 정보데이터가 출력이 되어 있어야 하므로 
		// 특정회원의 정보를 가져와 model처리하여 view로 넘긴다.
		member = memberService.getMemberById(id);
		mv.addObject("member",member);
		mv.addObject("memberid", id);
		mv.setViewName("member/modiMemberForm.jsp");
		return mv;
	}
	
	
		//비밀번호수정처리
		//post방식
		//요청주소 ~컨페/member/update
		@PostMapping("/member/update")
		public String submitModiMemberForm(Member member) {
			//service -> DAO(repository)에서 update 실행
			logger.info(member.toString());
			
			
			return null;
		}
}
















