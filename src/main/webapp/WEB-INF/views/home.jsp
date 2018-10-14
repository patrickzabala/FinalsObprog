<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>MyMovieList Home</title>
</head>
<body class="homepage">
<form action="/logout" method="post" style="text-align: right">
    <input class="btn btn-danger" type="submit" value="Logout">
</form>
<div>
    <h1>Welcome, ${name}!</h1><br>
    
    <div class="list">
        <p class="status busy">Your To Watch List: </p>
        <ul class="towatch-list">
           <c:forEach items="${towatchs}" var="towatch">
                <li>
                    <label></label>
                    <span class="towatch-text">${towatch.name}</span>
                </li>
            </c:forEach>
        </ul>
    </div>
    <form action="/home" method="post">
        <input type="text" class="input-towatch" placeholder="Enter the movie you want to see next..." name="towatch">
        <button class="btn btn-info" type="submit">ADD MOVIE</button>
    </form>
</div>
<script src="webjars/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/popper.js/1.14.3/popper.min.js"></script>
</body>
</html>