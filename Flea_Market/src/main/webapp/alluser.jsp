<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Insert title here</title>
            <style type="text/css">
                * {
                    border: 1px solid black;
                    border-collapse: collapse;
                }
            </style>
        </head>
        <form action="search" method="get">
            查詢帳號: <input type="text" name="searchName">
            <button>送出</button>
        </form>

        <body>
            <table>
                <thead>
                    <tr>
                        <td>編號</td>
                        <td>姓名</td>
                        <td>帳號</td>
                        <td>密碼</td>
                        <td>修改使用者</td>
                        <td>刪除使用者</td>

                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${userlist}" var="item">

                        <tr>
                            <td>${item.number }</td>
                            <td>${item.userName }</td>
                            <td>${item.account }</td>
                            <td>${item.password }</td>
                            <td><a href="tranformData?number=${item.number}"><button>修改</button></a></td>
                            <td><a href="Deleteuser.do?number=${item.number}"><button>刪除</button></a></td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>

            <a href="admin.jsp"><button>返回首頁</button></a>

        </body>

        </html>