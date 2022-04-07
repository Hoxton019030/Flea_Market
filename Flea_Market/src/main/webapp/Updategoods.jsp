<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Insert title here</title>
            <style type="text/css">
                table {
                    border: 1px solid black;
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
                    </tr>
                </thead>

                <tbody>
                    <form action="updategoodsdetail" method="post" enctype="multipart/form-data">
                        <c:forEach items="${goodsInformation}" var="item">
                            <tr>
                                <td><input type="text" value="${item.account}" disabled="disabled"></td>
                                <td><input type="text" value="${item.goodsName}"></td>
                                <td><input type="text" value="${item.goodsPrice}"></td>
                                <td><input type="text" value="${item.goodsVolume}"></td>
                                <td><input type="text" value="${item.goodsdiscribe}"></td>
                                <td><input type="file"></td>
                                <tr/>
                        </c:forEach>
                        <a href=""><button>提交</button></a>
                        <a href=""><button>取消</button></a>
                    </form>
                </tbody>
            </table>

        </body>

        </html>