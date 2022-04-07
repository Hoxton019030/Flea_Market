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

        <body>
            <table>
                <thead>
                    <tr>
                        <td>帳號</td>
                        <td>商品名稱</td>
                        <td>商品價錢</td>
                        <td>商品數量</td>
                        <td>商品描述</td>
                        <td>商品圖片</td>
                        <td>修改商品</td>
                        <td>刪除商品</td>

                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${goodslist}" var="item">
                        <tr>
                            <td>${item.account}</td>
                            <td>${item.goodsName}</td>
                            <td>${item.goodsPrice}</td>
                            <td>${item.goodsVolume}</td>
                            <td>${item.goodsdiscribe}</td>
                            <td><img src="${item.goodsimg}" alt="找不到這張圖片"></td>
                            <td><a href="updateGoods.do?account=${item.account}"><button>修改商品</button></a></td>
                            <td><a href=""><button>刪除商品</button></a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </body>

        </html>