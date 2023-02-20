package com.mycompany.member.repository;

import java.util.List;

import com.mycompany.member.domain.Member;

public interface MemberRepository {
	
	
	//회원등록 처리
	public void setNewMember(Member member);
	
	//(회원id) 상세회원정보조회
	public Member getMemberById(String id);


	//회원목록조회
	public List<Member> getAllMemberList();
	
	public abstract void modiMember(Member member);
	
	public abstract void deleteMember(String memberid);
}


