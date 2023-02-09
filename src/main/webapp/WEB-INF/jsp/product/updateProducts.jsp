<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DB UPDATE</title>
</head>
<body>
	<h1>수정할 상품명 : ${selectItem.itemName}</h1>
	<form action="/mybatis/updateProduct" method="post">
		<table>
			<thead>
				<tr>
					<th>column</th>
					<th>values</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>id</td>
					<td><input type="text" name="id" value="${selectItem.id}" /></td>
				</tr>
				<tr>
					<td><input type="hidden" name="itemName" value="${selectItem.itemName}" /></td>
				</tr>
				<tr>
					<td>price</td>
					<td><input type="number" name="price"
						value="${selectItem.price}" /></td>
				</tr>
				<tr>
					<td>itemDetails</td>
					<td><textarea name="itemDetail" cols="20" rows="3">${selectItem.itemDetail}</textarea></td>
				</tr>
				<tr>
					<td>SellState</td>
					<td><select name="sellStatCd">
							<c:if test="${selectItem.sellStatCd eq 'SELL'}">
								<option value="SELL">SELL</option>
								<option value="SOLD-OUT">SOLD-OUT</option>
							</c:if>
							<c:if test="${selectItem.sellStatCd eq 'SOLD-OUT'}">
								<option value="SOLD-OUT">SOLD-OUT</option>
								<option value="SELL">SELL</option>
							</c:if>
					</select></td>
				</tr>
				<tr>
					<td>first add time</td>
					<td><input type="text" readonly="readonly" value = "${selectItem.regTime}"/></td>
				</tr>
				<tr>
					<td>POST</td>
					<td><button type="submit" value="update">MODIFY</button></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>