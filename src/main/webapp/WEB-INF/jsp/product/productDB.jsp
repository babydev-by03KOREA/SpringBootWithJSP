<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Product Values by MySQL</title>
<style>
table {
	text-align: center;
}

a {
	text-decoration: none;
}
</style>
<script type="text/javascript" src="../js/deleteSubmit.js"></script>
</head>
<body>
	<h1>상품 TableList JSP</h1>
	<table border="1">
		<thead>
			<tr>
				<td>삭제선택</td>
				<td>순번</td>
				<td>회사명</td>
				<td>상품명[PK]</td>
				<td>상품설명</td>
				<td>판매상태</td>
				<td>가격</td>
				<td>상품등록일</td>
				<td>상품수정일</td>
				<td>삭제</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="items" items="${productList}" varStatus="status">
				<tr>
					<td><input type="checkbox" value="${items.itemName}" /></td>
					<td>${status.count}</td>
					<td>${items.id}</td>
					<td><a href="/mybatis/update/${items.itemName}">${items.itemName}</a></td>
					<td>${items.itemDetail}</td>
					<td>${items.sellStatCd}</td>
					<td><fmt:formatNumber>${items.price}</fmt:formatNumber>₩</td>
					<td>${items.regTime}</td>
					<c:if test="${items.updateTime ne items.regTime}">
						<td><c:out value="${items.updateTime}" /></td>
					</c:if>
					<c:if test="${items.updateTime eq items.regTime}">
						<td><c:out value="not update" /></td>
					</c:if>
					<td><button type="button" onclick="location.href = '/mybatis/delete/${items.itemName}'">삭제</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>