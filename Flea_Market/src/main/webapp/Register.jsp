<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>註冊會員</title>
</head>

<body>
	<form action="Register" method="post">
		帳號: <input type="text" name="account"> <br> 密碼: <input
			type="password" name="password"> <br> 姓名: <input
			type="text" name="username"> <br>
		<button>送出</button>
	</form>

</body>

</html>