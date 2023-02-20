package com.edu.springboot.regist;

import java.util.HashMap;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class MainController {

	private static final String String = null;

	@Autowired
	RMemberService dao;
	
	TransactionManager transactionManager;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}

	//회원메인창으로 넘어가기
	@GetMapping("/main.do")
	public String main1(HttpSession session) {
		session.getAttribute("UserEmail");
		return "main";
	}
	
	//회원가입창으로 넘어가기
	@GetMapping("/regist.do")
	public String registM(Model model) {
		model.addAttribute("mem_type","member");
		return "regist";
	}
	
	@GetMapping("/registT.do")
	public String registT(Model model) {
		model.addAttribute("mem_type","trainer");
		return "regist";
	}
	
	@GetMapping("/registASUB.do")
	public String registASUB(Model model) {
		model.addAttribute("mem_type","admin_sub");
		return "regist";
	}
	
	//회원가입 폼 받아서 실행
	@PostMapping("/regist.do")
	@Transactional
	public String registM2(MemberDTO memberDTO) {
//		try {
			int result = dao.insertMember(memberDTO);
//			int resultlog = dao.insertLog(memberDTO);
			if(result==1) System.out.println("회원가입이 완료되었습니다.");
//			if(resultlog==1) System.out.println("멤버로그에 insert 완료되었습니다.");
			
//		}
//		catch (Exception e) {
//			System.out.println("제약조건 위반으로 모두 취소되었습니다.");
//		}
		return "main";
	}
	
	//회원가입 폼 받아서 실행
	@PostMapping("/registT.do")
	@Transactional
	public String registT2(MemberDTO memberDTO) {
//		try {
			int result = dao.insertMemberT(memberDTO);
//			int resultlog = dao.insertLogT(memberDTO);
			if(result==1) System.out.println("회원가입이 완료되었습니다.");
//			if(resultlog==1) System.out.println("멤버로그에 insert 완료되었습니다.");
			
//		}
//		catch (Exception e) {
//			System.out.println("제약조건 위반으로 모두 취소되었습니다.");
//		}
		return "main";
	}
	
	//회원가입 폼 받아서 실행
	@PostMapping("/registT.do")
	@Transactional
	public String registASUB2(MemberDTO memberDTO) {
//		try {
		int result = dao.insertMemberASUB(memberDTO);
//			int resultlog = dao.insertLogT(memberDTO);
		if(result==1) System.out.println("회원가입이 완료되었습니다.");
//			if(resultlog==1) System.out.println("멤버로그에 insert 완료되었습니다.");
		
//		}
//		catch (Exception e) {
//			System.out.println("제약조건 위반으로 모두 취소되었습니다.");
//		}
		return "main";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//admin에서 회원목록 보여주기
	@RequestMapping("/list.do")
	public String list1(Model model) {
		model.addAttribute("memberList",dao.select());
		return "list";
	}
	
	//회원 로그인창으로 넘어가기
	@GetMapping("/login.do")
	public String login1() {
		return "login";
	}
	
	//회원 로그인 하기
	@PostMapping("/login.do")
	public String login1(HttpSession session, MemberDTO memberDTO) {
		try {
			session.setAttribute("UserEmail", dao.login(memberDTO));
			return "main";
		}
		catch (Exception e) {
			System.out.println("로그인 중 오류발생");
			return "login";
		}
	}
	
	//회원 로그아웃하기
	@GetMapping("/logout.do")
	public String logout1(HttpSession session) {
		session.invalidate();
		return "main";
	}
	
//
//	//카카오톡 인가코드 받기
//	@GetMapping("/callback")
//	@ResponseBody
//	public String kakaocallback(@RequestParam String code) {
//		
//		//post방식으로 key=value 데이터를 요청(카카오쪽으로)
//		RestTemplate rt = new RestTemplate();
//		
//		//HttpHeaders 오브젝트 생성
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Content-type", "application/x-www-form-urlencoded;charset=UTF-8");
//		
//		//HttpBody 오브젝트 생성
//		MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//		params.add("grant_type", "authorization_code");
//		params.add("client_id", "bd8c5cf77602a837f1013c5f5b356e29");
//		params.add("redirect_uri", "http://localhost:8080/callback");
//		params.add("code", code);
//		
//		//HttpHeaders와 HttpBody를 하나의 오브젝트에 담기
//		HttpEntity<MultiValueMap<String, String>> kakaoTokenRequest =
//			new HttpEntity<>(params, headers);
//		
//		//Http 요청하기 - Post방식으로 - 그리고 response 변수의 응답 받음
//		ResponseEntity<String> response = rt.exchange(
//			"https://kauth.kakao.com/oauth/token",
//			HttpMethod.POST,
//			kakaoTokenRequest,
//			String.class
//		);
//		
//		//Gson,Json Simple,ObjectMapper 라이브러리가 있음
//		ObjectMapper objectMapper = new ObjectMapper();
//		OAuthToken oauthToken = null;
//		try {
//			oauthToken = objectMapper.readValue(response.getBody(), OAuthToken.class);
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("카카오 엑세스 토큰:"+ oauthToken.getAccess_token());
//		
//		RestTemplate rt2 = new RestTemplate();
//		
//		//HttpHeaders 오브젝트 생성
//		HttpHeaders headers2 = new HttpHeaders();
//		headers2.add("Authorization", "Bearer "+oauthToken.getAccess_token());
//		headers2.add("Content-type", "application/x-www-form-urlencoded;charset=UTF-8");
//		
//		
//		//HttpHeaders와 HttpBody를 하나의 오브젝트에 담기
//		HttpEntity<MultiValueMap<String, String>> kakaoProfileRequest2 =
//			new HttpEntity<>(headers2);
//		
//		//Http 요청하기 - Post방식으로 - 그리고 response 변수의 응답 받음
//		ResponseEntity<String> response2 = rt2.exchange(
//			"https://kapi.kakao.com/v2/user/me",
//			HttpMethod.POST,
//			kakaoProfileRequest2,
//			String.class
//		);
//		
//		System.out.println(response2.getBody());
//		
//		ObjectMapper objectMapper2 = new ObjectMapper();
//		KakaoProfile kakaoProfile = null;
//		try {
//			kakaoProfile = objectMapper2.readValue(response2.getBody(), KakaoProfile.class);
//		} catch (JsonMappingException e) {
//			e.printStackTrace();
//		} catch (JsonProcessingException e) {
//			e.printStackTrace();
//		}
//		
//		//User 오브젝트: email, password,
//		System.out.println("카카오 아이디(번호):"+kakaoProfile.getId());
//		System.out.println("카카오 이메일:"+kakaoProfile.getKakao_account().getEmail());
//		
//		System.out.println("블로그 유저이메일(아이디):"+ kakaoProfile.getKakao_account().getEmail());
//		//패스워드 임시로 만들어줌
//		UUID tempPassword = UUID.randomUUID();
//		System.out.println("블로그 패스워드"+tempPassword);
//		
//		
//		
//		
//		
//		return response2.getBody(); 
//	}

	
	
	/*
	 * @GetMapping("/callback")
	 * 
	 * @ResponseBody public String getAuthorizationCode(@RequestParam String code,
	 * HttpSession session, Model model) { //1. 인증코드 요청 전달 String access_token =
	 * dao.getAccessToken(code); //2. 인증코드로 토큰 전달 HashMap<String, Object> userInfo =
	 * kakaoAPI.getUserInfo(access_token);
	 * 
	 * System.out.println("login info: "+ userInfo.toString());
	 * 
	 * if(userInfo.get("email")!= null) { session.setAttribute("userId",
	 * userInfo.get("email")); session.setAttribute("access_token", access_token); }
	 * model.addAttribute("userId",userInfo.get("email"));
	 * 
	 * return "인가 코드: "+ code; }
	 */
	
	
}