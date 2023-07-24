<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서정보</title>
<link href ="${rootPath}/static/css/books.css?" rel="stylesheet"/>
<script src="${rootPath}/static/js/books.js?"></script>
</head>
<body>
	<table class = "list">
		<tr>
			<th>도서코드</th>
			<th>도서명</th>
			<th>저자</th>
			<th>출판사</th>
			<th>구입연도</th>
			<th>구입가격</th>
			<th>대여가격</th>
		</tr>
		<c:forEach items="${BOOK_LIST}" var="BOOK">
		<tr data-id="${BOOK.b_code}">
			<td>${BOOK.b_code}</td>
			<td>${BOOK.b_name}</td>
			<td>${BOOK.b_auther}</td>
			<td>${BOOK.b_comp}</td>
			<td>${BOOK.b_year}</td>
			<td>${BOOK.b_iprice}</td>
			<td>${BOOK.b_rprice}</td>
		</tr>
		</c:forEach>		
	</table>
	<div>
		<button type="button"><a href="insert">등록하기</a></button>
	</div>
</body>
</html>