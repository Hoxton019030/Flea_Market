<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>我是首頁</title>
</head>

<body>

	這是首頁<br>


	<button onclick="location.href='goodsPage.jsp'">上架商品</button>
	<form action="checkPersonalGoods" method="post">
		<button>查看我到底上架了什麼商品</button>
		<input type="text" name="account" value="${loginSuccessUser.account}"> <br>
	</form>
</body>

</html>
