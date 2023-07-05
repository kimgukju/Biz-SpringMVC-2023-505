<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table class="main list">
	<tr>
		<th>NO.</th>
		<th>할일</th>
		<th>완료여부</th>
	</tr>
	<c:forEach begin="0" end="1" var="INDEX">
		<c:set value="${LISTS[INDEX]}" var="LIST" />
		<tr data-id="${LIST.a_id}">
			<td>${LIST.INDEX}</td>
			<td></td>
			<td></td>
		</tr>
	</c:forEach>
</table>