<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>MyBatis INSERT</title>
<style>
table {
	text-align: center;
}
</style>
</head>
<body>
	<form action="/mybatis/addValues" method="post">
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
					<td><input type="text" name="id" /></td>
				</tr>
				<tr>
					<td>itemName</td>
					<td><input type="text" name="itemName" /></td>
				</tr>
				<tr>
					<td>price</td>
					<td><input type="number" name="price" /></td>
				</tr>
				<tr>
					<td>itemDetails</td>
					<td><textarea name="itemDetail" cols="20" rows="3"></textarea></td>
				</tr>
				<tr>
					<td>SellState</td>
					<td><select name="sellStatCd">
							<option value="SELL">SELL</option>
							<option value="SOLD-OUT">SOLD-OUT</option>
					</select></td>
				</tr>
				<tr>
					<td>POST ADD</td>
					<td><button type="submit">ADD</button></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>