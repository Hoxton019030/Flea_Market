<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<form action="updateUser" method="post">
		<c:forEach items="${menberInformation}" var="item">
                    姓名: <input type="text" name="userName"
				value="${item.userName}" />
			<br> 帳號:
                    <input type="text" name="account"
				value="${item.account}">
			<br> 密碼:
                    <input type="text" name="password"
				value="${item.password}">
			<input type="hidden" name="number" value="${item.number}">
			<br>


		</c:forEach>
		<button>提交更改</button>
	</form>
</body>

</html>