<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>Spring Boot Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<table class="table table-striped">
			<caption>Your todos are</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is it Done?</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos }" var="todo">
					<tr>
						<td>${todo.description }</td>
						<td>${todo.targetDate }</td>
						<td>${todo.isDone }</td>
						<td><a type="button" class="btn btn-danger" href="/delete-todo?id=${todo.id }">Delete ${ todo.id}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a class="button" href="/add-todo">Add a new Todo</a>
		</div>
	</div>
	<script type="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script type="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>