package com.mycompany.member.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.member.domain.Member;

//DAO 역할하는 곳
@Repository
public class MemberRepositoryImpl implements MemberRepository{
	
	/*
	 * Bean으로 등록해둔 dataSource를 이용하여 JdbcTemplate클래스 객체를 자동주입시켜야한다.
	 * 여기에서는 servlet-context.xml 문서에서 아래와 같이 설정
	 */
	private JdbcTemplate template;

    @Autowired 
    public void setDataSource(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource); 
    }
	
	//회원등록
	public void setNewMember(Member member) {
		System.out.println("member");
		String sql="insert into simplemember (id,passwd,name,gender,regdate)" + 
					" values (?,?,?,?,?)";
		
		this.template.update(
		        sql,
		        member.getId(),member.getPasswd(),member.getName(),member.getGender(),member.getRegdate());
		return;
	}
	
	
	//(회원id로 )회원정보조회
	//파라미터 String id : 조회하고자하는 회원 id
	//리턴타입 Member : 상세회원정보
	@Override
	public Member getMemberById(String id) {
		String sql="select id,passwd,name,gender,regdate" + 
				" from spdb.simplemember" + 
				" where id=?";
		
		Member member = template.queryForObject(sql,new MemberRowMapper(),id);
		return member;
	}

	
	//회원목록조회
	@Override
	public List<Member> getAllMemberList() {
		String sql="select id,passwd,name,gender,regdate" + 
				" from simplemember";
		
		List<Member> memberList = this.template.query(
		        sql,
		        new MemberRowMapper()); 
		return memberList;
	}
}











