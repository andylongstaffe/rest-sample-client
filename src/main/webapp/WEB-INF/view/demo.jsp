<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="<c:url value="/resources/js/demo.js" />"></script>
</head>
<body>
<h2>Restful call made from controller</h2>
<h3>Request</h3>
userservices/users using Jersey-client
<h3>Result</h3>
${users}
<h2>Restful call made from webpage</h2>
<h3>Request</h3>
Ajax jquery request
<h3>Result</h3>
<p class="users">The output is: </p>
</body>
</html>