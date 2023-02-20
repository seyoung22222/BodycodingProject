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
 <script type="text/javascript">
/* function sending(f, mem_type){
	if(mem_type==1)
		f.action="/regist.do"
	else if(mem_type==2)
		f.action="/registT.do"
	else if(mem_type==3)
		f.action="/registASB.do"
	
	f.submit();
} */
function movePage(f){
	
	let mem_type = f.mem_type.value;
	
	if(mem_type=='MEMBER')
		f.action="/regist.do"
	else if(mem_type=='TRAINER')
		f.action="/registT.do"
	else if(mem_type=='ADMIN_SUB')
		f.action="/registASB.do"
	
}
</script> 
    <h1>회원가입</h1>
    <form method="post" onsubmit="movePage(this)">
    	<input type="hi-dden" id="mem_status" name="mem_status" value="1">
    	
    	<br>
        <label for="mem_id">아이디(이메일):</label>
        <input type="email" id="mem_id" name="mem_id" required><br>
        
        <label for="mem_pass">비밀번호:</label>
        <input type="password" id="mem_pass" name="mem_pass" required><br>

        <label for="mem_name">이름:</label>
		<input type="text" id="mem_name" name="mem_name" required><br>

        <label for="mem_gender">성별:</label>
        <input type="radio" id="mem_gender" name="mem_gender" value="M">남자
        <input type="radio" id="mem_gender" name="mem_gender" value="F">여자<br>

        <label for="mem_birth">생년월일:</label>
        <input type="date" id="mem_birth" name="mem_birth"><br>

        <label for="mem_phone">전화번호:</label>
        <input type="tel" id="mem_phone" name="mem_phone" required><br>

        <label for="mem_address">주소:</label>
        <input type="text" id="mem_address" name="mem_address" required><br>

        <label for="gym_code">지점선택:</label>
        <input type="text" id="gym_code" name="gym_code" required><br>

		<c:if test="${mem_type eq 'member'}">
			<input type="hi-dden" id="mem_point" name="mem_point" value="0">
			<input type="hi-dden" id="mem_type" name="mem_type" value="MEMBER">
	        <br>
	        <label for="mem_height">키:</label>
	        <input type="number" id="mem_height" name="mem_height" step="0.01" required><br>
	
	        <label for="mem_weight">몸무게:</label>
	        <input type="number" id="mem_weight" name="mem_weight" step="0.01" required><br>
	        <label for="mem_disease">질병:</label>
	        <input type="text" id="mem_disease" name="mem_disease"><br>
	
	        <label for="mem_purpose">운동목적:</label>
	        <input type="text" id="mem_purpose" name="mem_purpose"><br>
	
	        <label for="mem_interest">관심사항:</label>
	        <input type="text" id="mem_interest" name="mem_interest"><br>
	
	        <label for="mem_inflow">유입경로:</label>
	        <input type="text" id="mem_inflow" name="mem_inflow"><br>
	        
	        <!-- <button type="submit">가입하기1</button>  -->
	 		<!-- <input type="submit" value="가입하기1" onclick="sending(this.form,1)"> -->
        </c:if>
        
        <c:if test="${mem_type eq 'trainer'}">
	        <input type="hi-dden" id="mem_type" name="mem_type" value="TRAINER">
	        <br>
	        <label for="mem_career">경력:</label>
	        <input type="text" id="mem_career" name="mem_career"><br>
	        
	        <label for="mem_comment">자기소개:</label>
	        <input type="text" id="mem_comment" name="mem_comment"><br>
	        
	        <label for="mem_career">프로필 사진:</label>
	        <input type="text" id="mem_career" name="mem_career"><br>
	        
	        <!-- <input type="button" value="가입하기2" onclick="sending(this.form,2)"> -->
        </c:if>
        
        <c:if test="${mem_type eq 'admin_sub'}">
	        <input type="hi-dden" id="mem_type" name="mem_type" value="ADMIN_SUB">
	        <br>
	        <label for="mem_comment">매장소개:</label>
	        <input type="text" id="mem_comment" name="mem_comment"><br>
	        
	        <label for="mem_career">매장 사진:</label>
	        <input type="text" id="mem_career" name="mem_career"><br>
	        
	        <!-- <input type="button" value="가입하기3" onclick="sending(this.form,3)"> -->
        </c:if> 
        
        <button type="submit">가입하기</button>        
	</form>
</body>
</html>