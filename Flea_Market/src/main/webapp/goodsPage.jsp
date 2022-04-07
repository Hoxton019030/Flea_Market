<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>商品上架頁面</title>
    </head>

    <body>
        <form action="AddGoods" method="post" enctype="multipart/form-data">
        <input type="text" name="username" value="${loginSuccessUser.account}"> <br>
            商品名稱 <input type="text" name="goodsname"> <br>
            商品價錢 <input type="text" name="goodsprice"><br>
            商品數量 <input type="text" name="goodsvolume"><br>
            商品描述 <input type="text" name="goodsdiscribe"><br>
            商品圖片 <input type="file" name="goodsimage"><br>
            <button>提交</button>
        </form>


    </body>

    </html>