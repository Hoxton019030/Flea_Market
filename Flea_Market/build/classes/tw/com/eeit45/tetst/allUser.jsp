<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="UTF-8">
			<title>EEIT43Shop</title>

			<style type="text/css">
				* {
					border: 1px solid black;
				}
			</style>
		</head>

		<body>
			<table>
				<td><input type="button" name="Submit" value="新增使用者" class="btn"
					onclick="location.href='add.jsp'" /></td>
			</table>

			<table>
				<thead>
					<tr>
						<td>使用者</td>
						<td>使用者名稱</td>
						<td>使用者密碼</td>
						<td>使用者信箱</td>
						<td>修改按鈕</td>
						<td>刪除按鈕</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${userList}" var="item">

						<tr>
							<td>${item.id}</td>
							<td>${item.userName}</td>
							<td>${item.password}</td>
							<td>${item.email}</td>
							<td>
								<center><a href="update.jsp?id=${item.id}&userName=${item.userName}&password=${item.password}&email=${item.email}"><button class="upTarget">修改</button></a></center>
							</td>
							<td>
								<center><button class="myTarget" id="${item.id}">刪除</button></center>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<script type="text/javascript">
				let btnCollection = document.getElementsByClassName("myTarget");

				for (item of btnCollection) {
					item.addEventListener("click", function () {
						let state = window.confirm("確定刪除嗎")
						if (state) {
							let id = this.getAttribute("id");

							document.location.href = "DeleteUser.do?id=" + id;
						}
					})
				}


			</script>
			<script>
				let button = document.getElementsByClassName("upTarget");

				for (item of button) {
					item.addEventListener("click", function () {
						let state = window.confirm("確定修改嗎")
						if (state) {
							let id = this.getAttribute("id");
							
							document.location.href = "UpdateUser.do?id=" + id;
						}
					})
				}
			</script>
		



		</body>

		</html>