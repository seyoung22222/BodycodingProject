package com.edu.springboot.regist;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RMemberService{

	public int insertMember(MemberDTO memberDTO);
	public int insertMemberT(MemberDTO memberDTO);
	public int insertMemberASUB(MemberDTO memberDTO);
	public int insertLog(MemberDTO memberDTO);
	public int insertLogT(MemberDTO memberDTO);
	public int insertLogASUB(MemberDTO memberDTO);
	public List<MemberDTO> select();
	public String login(MemberDTO memberDTO);
}
