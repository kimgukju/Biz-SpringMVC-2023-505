<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<c:set value="20230721-004" var ="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOOK RENT Management System 2023</title>
<link href ="${rootPath}/static/css/main.css?${version}" rel="stylesheet"/>

<script src="${rootPath}/static/js/main_nav.js?${version}"></script>
</head>
<body>
	<header class="main">
		<h1>빛고을 Book Rent Management System 2023</h1>
	</header>
<nav class="main">
	<ul>
		<li>Home</li>
		<li class = "books">도서정보</li>
		<li class = "users">회원정보</li>
	</ul>
</nav>
	<table class="main">
		<tr>
			<th>SEQ</th>
			<th>대출일</th>
			<th>반납예정일</th>
			<th>도서코드</th>
			<th>회원코드</th>
			<th>도서반납여부</th>
			<th>포인트</th>
		</tr>
	</table>
</body>
</html>