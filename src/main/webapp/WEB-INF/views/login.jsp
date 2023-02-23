<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입</h1>
    <form method="post" action="/login.do">
    	
        <label for="mem_id">이메일:</label>
        <input type="mem_id" id="mem_id" name="mem_id" required><br>
        
        <label for="mem_pass">비밀번호:</label>
        <input type="mem_pass" id="mem_pass" name="mem_pass" required><br>
        
        <button type="submit">로그인하기</button>
        <!-- Host: kauth.kakao.com -->
        <a href="https://kauth.kakao.com/oauth/authorize?client_id=a7d2784fba5cd05b34f27b173250d1b7&redirect_uri=http://localhost:8586/callback&response_type=code">
			<img src="images/kakao_login.png"></a>
	</form>
</body>
</html>