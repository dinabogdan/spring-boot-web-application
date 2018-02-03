<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>Spring Boot Web Application</title>
</head>

<body>
<h1>Your Todos</h1>
<table>
	<caption>Your todos are</caption>
	<thead>
		<tr>
			<th>Description</th>
			<th>Target Date</th>
			<th>Is it Done?</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${todos }" var="todo">
		<tr>
			<td>${todo.description }</td>
			<td>${todo.targetDate }</td>
			<td>${todo.isDone }</td>
		</tr>
		</c:forEach>
	</tbody>
</table>
<br/>
	<a href="/add-todo">Add a new Todo</a>
</body>

</html>