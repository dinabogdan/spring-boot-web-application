<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
	<font color="red">${invalidCredentials}</font>
	<form method="post">
		Name: <input type="text" name="name" /> Password: <input
			type="password" name="password" /> <input type="submit"
			value="Submit" />
	</form>
</div>
<%@ include file="common/footer.jspf"%>