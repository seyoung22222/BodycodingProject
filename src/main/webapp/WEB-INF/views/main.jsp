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
<h2>회원 메인 페이지</h2>
아이디(이메일): ${UserEmail}

<ul>
	<li><a href="regist.do">회원가입하기(member)</a></li>
</ul>

<ul>
	<li><a href="drop.do">회원탈퇴하기(member)</a></li>
</ul>

<ul>
	<li><a href="login.do">로그인하기(member)</a></li>
</ul>

<ul>
	<li><a href="logout.do">로그아웃하기(member)</a></li>
</ul>

<ul>
	<li><a href="/">홈으로</a></li>
</ul>

</body>
</html>