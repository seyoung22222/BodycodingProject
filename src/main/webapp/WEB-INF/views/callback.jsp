<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	var walletAddress;
	var totalReceived;
	var key;
	var txIDarray = null;
	var txID = null;
	
	function api(code){
		
		var grant_type = "authorization_code";
		var client_id = "bd8c5cf77602a837f1013c5f5b356e29";
		var redirect_uri = "http://localhost:8080/callback.jsp";
		var code = code;
		
		$.post("https://kauth.kakao.com/oauth/token", 
			{grant_type:grant_type, client_id:client_id, redirect_uri:redirect_uri, code:code}, function(data){
					
			var access_token = data['access_token']
			$('body').append(access_token+'<br>'); //엑세스토큰값 출력
			$('body').append('access_token:success | Loading..<br>')	
			
			tokenFunction(access_token);
		});
	}
	
	var tokenRequesst = new XMLHttpRequest();
	
	function tokenFunction(access_token){
		var access_token = access_token;
		
		tokenRequest.open("Post","../tokenServlet?access_token="+access_token,true);
		tokenRequest.
	}


</script>
</head>
<body>

</body>
</html>