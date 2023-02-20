package com.mycompany.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.member.domain.Member;
import com.mycompany.member.repository.MemberRepository;


@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	private MemberRepository memberRepository;
	
	//회원등록
	public void setNewMember(Member member) {
		memberRepository.setNewMember(member);
	}

	//(회원 ID로) 정보상세조회
	@Override
	public Member getMemberById(String id) {
		return memberRepository.getMemberById(id);
	}

	
	//회원목록조회
	@Override
	public List<Member> getAllMemberList() {
		return memberRepository.getAllMemberList();
	}

	@Override
	public void modiMember(Member member) {
		memberRepository.modiMember(member);
	}
	
	public  void deleteMember(String memberid) {
		System.out.println("여긴 접속되나?");
		memberRepository.deleteMember(memberid);
	}
}



