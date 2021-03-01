<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<meta charset="UTF-8">
<title>Payment card checkout</title>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
</head>

<body>
	<div class="container">
		<div class="col2">
			<f:form modelAttribute="k" action="../clients/add">
				<label>cin</label>
				<f:input path="cin" maxlength="19" placeholder="account" />
				<label>papers</label>
				<f:input path="nom" maxlength="19" placeholder="papers" />
				<button class="Add">Add</button>
			</f:form>
		</div>
	</div>
</body>
</html>
