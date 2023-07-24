<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<body>
	<table>
		<tr>
			<th>회원코드</th>
			<th>회원명</th>
			<th>전화번호</th>
			<th>주소</th>
		</tr>
		<c:forEach items="${USER_LIST}" var="USER">
		<tr>
			<td><a href="details">${BOOK.b_code}</a></td>
			<td>${USER.u_name}</td>
			<td>${USER.u_name}</td>
			<td>${USER.u_tel}</td>
			<td>${USER.u_addr}</td>
		</tr>
		</c:forEach>		
	</table>
	<div>
		<button type="button"><a href="insert">등록하기</a></button>
	</div>
</body>
</html>