package com.edu.springboot.regist;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
	public int kakaoinsert(Map<String, String> map);
	public String kakaoselect(String mem_id);
	public int kakaoupdate(MemberDTO memberDTO);
}
