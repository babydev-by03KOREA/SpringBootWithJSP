<!doctype html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
</head>
<body>
<script src="https://cdn.jsdelivr.net/npm/vue@2.6.12/dist/vue.js"></script>
<h1>CHATGPT</h1>
<div id="app">
  <table>
    <thead>
    <tr>
      <th>Name</th>
      <th>Age</th>
      <th>Occupation</th>
    </tr>
    </thead>
    <tbody>
    <tr v-for="person in people">
      <td>{{ person.name }}</td>
      <td>{{ person.age }}</td>
      <td>{{ person.occupation }}</td>
    </tr>
    </tbody>
  </table>
</div>
<script>
  var app = new Vue({
    el: "#app",
    data: {
      people: [
        { name: "John Doe", age: 32, occupation: "Developer" },
        { name: "Jane Doe", age: 29, occupation: "Designer" },
        { name: "Bob Smith", age: 40, occupation: "Manager" }
      ]
    }
  });
</script>

</body>
</html>