<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
p {
font-size: 20px;
}
</style>
</head>
<body>
	<%
	/*
	<p>USERNAME : ${username}</p>
	<p>PASSWORD : ${password}</p>
	<p>RE_PASSWORD : ${re_password}</p>
	<p>이름 : ${name}</p>
	<p>전화번호 : ${tel}</p>
	<p>주소 : ${addr}</p>
	*/
	%>
	<p>USERNAME : ${USER.username}</p>
	<p>PASSWORD : ${USER.password}</p>
	<p>이름 : ${USER.name}</p>
	<p>전화번호 : ${USER.tel}</p>
	<p>주소 : ${USER.addr}</p>
	
	

</body>
</html>