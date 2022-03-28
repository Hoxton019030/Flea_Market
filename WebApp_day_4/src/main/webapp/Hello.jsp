<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = "Hoxton";
	String item = "book";
	%>
	<div>
		Hello!<%=name%>
		
	</div>
	<div>你有<% out.write(item); %></div>

</body>
</html>