<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>List</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<%@include file="../header.jsp" %>
<h2>상품 등록 리스트</h2>
<div id="app">
    <table>
        <thead>
        <tr>
            <td>순번</td>
            <td>회사명</td>
            <td>상품명[PK]</td>
            <td>상품설명</td>
            <td>판매상태</td>
            <td>가격</td>
            <td>상품등록일</td>
            <td>상품수정일</td>
        </tr>
        </thead>
        <tbody>
        <tr v-for="item in items">
            <td>{{ item.count }}</td>
            <td>{{ item.id }}</td>
            <td>{{ item.itemName }}</td>
            <td>{{ item.itemDetail }}</td>
            <td>{{ item.sellStatCd }}</td>
            <td>{{ item.price }}</td>
            <td>{{ item.regTime }}</td>
            <td>{{ item.updateTime }}</td>
        </tr>
        </tbody>
    </table>
</div>
<c:forEach var="items" items="${productList}" varStatus="status">
    <script>
        let app = new Vue({
            el: '#app',
            data: {
                items: [
                    {
                        "count": "${status.count}",
                        "id": "${items.id}",
                        "itemName": "${items.itemName}",
                        "itemDetail": "${items.itemDetail}",
                        "sellStatCd": "${items.sellStatCd}",
                        "price": "${items.price}",
                        "regTime": "${items.regTime}",
                        "updateTime": "${items.updateTime}"
                    }
                ],
            },
        });
    </script>
</c:forEach>
<%@include file="../footer.jsp" %>
<style>
    table {
        text-align: center;
    }
</style>
</body>
</html>