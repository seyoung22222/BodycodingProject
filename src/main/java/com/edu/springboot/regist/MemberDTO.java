package com.edu.springboot.regist;

import java.sql.Date;

import org.apache.ibatis.jdbc.SQL;

import lombok.Data;

@Data
public class MemberDTO {
	
	private String email;
	private String name;
	private String password;
	private String sex;
	private String birth;
	private String phone;
	private String address;
	private String center;
	private String member_list;
	private Float  height;
	private Float  weight;
	private String disease;
	private String purpose;
	private String keyword;
	private String inflow;
	private Date memberdate;
	private int point;
}
