<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath }" var="rootPath" />
<c:set value="20230705-0004" var ="version" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${rootPath}/static/css/main.css?${version}" rel="stylesheet"/>
<link href="${rootPath}/static/css/list.css?${version}" rel="stylesheet"/>
<link href="${rootPath}/static/css/nav.css?${version}" rel="stylesheet"/>

<link href="${rootPath}/static/css/table.css?${version}" rel="stylesheet"/>

</head>
<body>
<h1>TO DO LIST 2023</h1>
<%@ include file = "/WEB-INF/views/nav.jsp" %>
<section class = "main">
	<%@ include file = "/WEB-INF/views/list.jsp" %>

</section>

</body>
</html>