<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>상품 DTO JSP</title>
</head>
<body>
	<h1>삼품 데이터 JSP</h1>
	<div>
		상품명 : <span>${productDTO.itemName}</span>
	</div>
	<div>
		상품상세설명 : <span>${productDTO.itemDetail}</span>
	</div>
	<div>
		상품등록일 : <span>${productDTO.regTime}</span>
	</div>
	<div>
		상품가격 : <span><fmt:formatNumber value="${productDTO.price}" /></span>
	</div>
</body>
</html>