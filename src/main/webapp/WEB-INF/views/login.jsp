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
    	
        <label for="email">이메일:</label>
        <input type="email" id="email" name="email" required><br>
        
        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" required><br>
        
        <button type="submit">로그인하기</button>
        <!-- Host: kauth.kakao.com -->
        <a href="https://kauth.kakao.com/oauth/authorize?client_id=bd8c5cf77602a837f1013c5f5b356e29&redirect_uri=http://localhost:8080/callback&response_type=code">
			<img src="images/kakao_login.png"></a>
	</form>
</body>
</html>