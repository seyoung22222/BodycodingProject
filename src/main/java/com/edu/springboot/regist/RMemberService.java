package com.edu.springboot.regist;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RMemberService{

	public int insertMember(MemberDTO memberDTO);
	public int insertLog(MemberDTO memberDTO);
	public List<MemberDTO> select();
	public String login(MemberDTO memberDTO);
}
