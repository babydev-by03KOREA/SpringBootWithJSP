<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>Vue.js CDN</title>
</head>
<body>
<jsp:include page="./header.jsp"></jsp:include>
<div id="app">{{ message }}</div>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script>
    let app = new Vue({
        el: '#app',
        data: {
            message: 'Hello Vue JSP!'
        }
    }).mount('#app')
</script>
<jsp:include page="./footer.jsp"></jsp:include>
</body>
</html>