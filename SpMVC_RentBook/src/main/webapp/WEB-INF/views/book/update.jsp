<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<script src="${rootPath}/static/js/update.js?20230721-001"></script>
<form method = "POST" class="main update">
	<fieldset>
	<legend>책 정보 변경</legend>	
	<div>
		<strong>도서코드</strong> <input name="b_code" value="${BOOK.b_code}">
	</div>
	<div>
		<strong>도서명</strong> <input name="b_name" value="${BOOK.b_name}">
	</div>
	<div>
		<strong>저자</strong> <input name="b_auther" value="${BOOK.b_auther}">
	</div>
	<div>
		<strong>출판사</strong> <input name="b_comp" value="${BOOK.b_comp}">
	</div>
	<div>
		<strong>구입연도</strong> <input name="b_year" value="${BOOK.b_year}">
	</div>
	<div>
		<strong>구입가격</strong> <input name="b_iprice" value="${BOOK.b_iprice}">
	</div>
	<div>
		<strong>대여가격</strong> <input name="b_rprice" value="${BOOK.b_rprice}">
	</div>
	
	<div>
	<button class = "button update" type="button">저장하기</button>
	</div>
	</fieldset>
</form>