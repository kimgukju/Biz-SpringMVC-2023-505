<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>차량 관리 매니저</title>
</head>
<body>
<header>
<h1>MY CAR MANAGER</h1>
</header>
<form class="mian" method="POST">
<div>
<strong>운행등록</strong> 
<input placeholder="구분" name="division"/>
<input placeholder="시작거리" name="s_distance"/>
<input placeholder="장소" name="place"/>
</div>
<div>
<input placeholder="종료거리" name="a_distance"/>
<input placeholder="소요비용" name="cost"/>
<button class="button">저장</button>
</div>
</form>
<table class="main">
	<tr>
		<th>No.</th>
		<th>구분</th>
		<th>출발일자</th>
		<th>출발시간</th>
		<th>출발거리(KM)</th>
		<th>도착일자</th>
		<th>도착시간</th>
		<th>도착거리(KM)</th>
		<th>장소</th>
		<th>소요비용</th>
	</tr>
	<c:forEach items="${CAR_LIST}" var="CAR">
		<tr>
	
			<td>${CAR.c_seq}</td>
			<td>${CAR.c_division}</td>
			<td>${CAR.c_sdate}</td>
			<td>${CAR.c_stime}</td>
			<td>${CAR.c_sdistance}</td>
			<td>${CAR.c_adate}</td>
			<td>${CAR.c_atime}</td>
			<td>${CAR.c_adistance}</td>
			<td>${CAR.c_place}</td>
			<td>${CAR.c_cost}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>