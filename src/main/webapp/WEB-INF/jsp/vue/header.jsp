<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>VUE-HEADER</title>
<style scoped>
		header {
			width: 100%;
			text-align: center;
			position: relative;
			height: 120px;
			border-bottom: 1px solid #35495e
		}
		
		header img {
			width: 80px;
			height: 80px;
		}
		
		header h1 {
			position: absolute;
			top: 0;
			left: 100px;
		}
		
		header ul.menu:after {
			display: block;
			clear: both;
			content: '';
		}
		
		header ul.menu {
			position: absolute;
			top: 20px;
			right: 50px;
		}
		
		header ul.menu li {
			float: left;
			padding: 10px 20px;
			list-style: none;
		}
		
		a {
			text-decoration: none;
			color: #333;
		}
	</style>
</head>
<body>
	<header>
		<h1><a href="/vue"><img src="/image/Trip.do.png" alt="trip.do" /></a></h1>
		<div class="menuWrap">
			<ul class="menu">
				<li><a href="javascript:;">메뉴1</a></li>
				<li><a href="javascript:;">메뉴2</a></li>
				<li><a href="javascript:;">메뉴3</a></li>
				<li><a href="javascript:;">메뉴4</a></li>
			</ul>
		</div>
	</header>
	<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
	
</body>
</html>