<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <ul>
        <li><p><b>Dzisiejsza data: ${data}</b>
        </p></li>
    </ul>
    <form method = "GET">
        First Name: <input type = "text" name = "first_name">
        <input type = "submit" value = "GET" />
    </form>
    <form method = "POST">
        First Name: <input type = "text" name = "first_name">
        <input type = "submit" value = "POST" />
    </form>
</body>
</html>
