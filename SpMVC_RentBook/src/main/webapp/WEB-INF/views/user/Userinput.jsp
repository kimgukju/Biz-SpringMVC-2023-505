<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<script src="${rootPath}/static/js/books_input.js"></script>
<form method="POST" class = "book input">
<fieldset>
<legend>유저 등록</legend>
<div><label>도서코드</label><input name="b_code"></div>
<div><label>도서명</label><input name="b_name"></div>
<div><label>저자</label><input name="b_auther"></div>
<div><label>출판사</label><input name="b_comp"></div>
<div><label>구입연도</label><input name="b_year"></div>
<div><label>구입가격</label><input name="b_iprice"></div>
<div><label>대여가격</label><input name="b_rprice"></div>
</fieldset>
<button class="button save">저장</button>
</form>