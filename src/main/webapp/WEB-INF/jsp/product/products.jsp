<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>상품 DTO List JSP</title>
<style>
table {
	text-align: center;
}
</style>
</head>
<body>
	<h1>상품 TableList JSP</h1>
	<table>
		<thead>
			<tr>
				<td>순번</td>
				<td>상품명</td>
				<td>상품설명</td>
				<td>가격</td>
				<td>상품등록일</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="items" items="${itemList}" varStatus="status">
				<tr>
					<%-- <td>${status.index}</td> --%>
					<td>
						<%-- <c:if test="${status.index % 2 eq 0}">
							<c:out value="짝수"></c:out>
						</c:if> 
						<c:if test="${status.index % 2 eq 1}">
							<c:out value="홀수"></c:out>
						</c:if> --%>
						<c:choose>
							<c:when test="${status.index % 2 eq 0}">
								<c:out value="짝수"></c:out>
							</c:when>
							<c:otherwise>
								<c:out value="홀수"></c:out>
							</c:otherwise>
						</c:choose>
					</td>
					<td>${items.itemName}</td>
					<td>${items.itemDetail}</td>
					<td><fmt:formatNumber>${items.price}</fmt:formatNumber>₩</td>
					<td>${items.regTime}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>