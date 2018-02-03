<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Spring Boot Web Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<form method="post">
			<fieldset class="form-group">
				<label>Description:</label> <input name="description" type="text"
					class="form-control" required="required" />
			</fieldset>
			<button type="submit" class="btn btn-success">Add</button>
		</form>
	</div>
	<script type="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script type="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>