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
    <form method="post" action="/regist.do">
    	<input type="hidden" id="point" name="point" value="0">
    	
        <label for="email">이메일:</label>
        <input type="email" id="email" name="email" required><br>
        
        <label for="email">이름:</label>
		<input type="text" id="name" name="name" required><br>

        <label for="password">비밀번호:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="sex">성별:</label>
        <input type="radio" id="sex" name="sex" value="M" required>남자
        <input type="radio" id="sex" name="sex" value="W" required>여자<br>

        <label for="birth">생년월일:</label>
        <input type="date" id="birth" name="birth" required><br>

        <label for="phone">전화번호:</label>
        <input type="tel" id="phone" name="phone" required><br>

        <label for="address">주소:</label>
        <input type="text" id="address" name="address" required><br>

        <label for="center">센터:</label>
        <input type="text" id="center" name="center" required><br>

        <label for="height">키:</label>
        <input type="number" id="height" name="height" step="0.01" required><br>

        <label for="weight">몸무게:</label>
        <input type="number" id="weight" name="weight" step="0.01" required><br>

        <label for="disease">질병:</label>
        <input type="text" id="disease" name="disease"><br>

        <label for="purpose">운동목적:</label>
        <input type="text" id="purpose" name="purpose"><br>

        <label for="keyword">키워드:</label>
        <input type="text" id="keyword" name="keyword"><br>

        <label for="inflow">유입경로:</label>
        <input type="text" id="inflow" name="inflow"><br>
        
		<button type="submit">가입하기</button>
        
        
	</form>
</body>
</html>