package com.mycompany.member.service;

import java.util.List;

import com.mycompany.member.domain.Member;


public interface MemberService {
	
		//회원등록 처리
		public abstract void setNewMember(Member member);
	
		//(회원 ID로) 정보상세조회
		public abstract Member getMemberById(String id);
		
		//회원목록조회
		public abstract List<Member> getAllMemberList();
		
		//비밀번호수정처리
		public void requestModiMemberForm();
}
