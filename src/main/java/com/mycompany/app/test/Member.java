package com.mycompany.app.test;

import java.util.Arrays;

//이클래스는 도메인 클래스로서
//data를 저장 및 제공
public class Member {
	//필드
	private int id; //아이디
	private String passwd; //비밀번호
	private String city; //거주지
	private String gender; //성별
	private String[] hobby; //취미
	private String addMember;
	
	//생성자
	public Member() {}

	//setter & getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getAddMember() {
		return addMember;
	}

	public void setAddMember(String addMember) {
		this.addMember = addMember;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", passwd=" + passwd + ", city=" + city + ", gender=" + gender + ", hobby="
				+ Arrays.toString(hobby) + ", addMember=" + addMember + "]";
	}

	

	
}
