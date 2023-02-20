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
	@GetMapping("/memberInfo")
	public String requestMemberById(@RequestParam("memberid") String id, Model model) {
		
		Member member = memberService.getMemberById(id);
		model.addAttribute("member",member);
		return "member/memberInfo";
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
	public ModelAndView requestModiMemberForm(String memberid, ModelAndView mv) {
		logger.info(memberid);
		mv.addObject("memberid", memberid);
		mv.setViewName("member/modiMemberForm");
		return mv;
	}
	
	
	//비밀번호수정처리
	//post방식
	//요청주소 ~컨페/member/update
	@PostMapping("/member/update")
	public String requestMemberUpdate() {
		return "member/memberList";
	}
}















