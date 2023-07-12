<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<article class="detail data">
<div>
	<strong>작성일자</strong> <span>${BBS.b_date}</span>
	<strong>작성시각</strong> <span>${BBS.b_time}</span>
	</div>
	<div>
	<strong>작성자</strong> <span>${BBS.b_username}</span>
	</div>
	<div>
	<strong>제목</strong> <span>${BBS.b_subject}</span>	
	</div>
	<div>
	<strong>내용</strong> <span>${BBS.b_content}</span>	
	</div>
	

</article>