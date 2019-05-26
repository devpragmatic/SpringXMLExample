<%--
  Created by IntelliJ IDEA.
  User: NB42RP
  Date: 2019-05-26
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Multiply</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css" integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js" integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd" crossorigin="anonymous"></script>
</head>
<body>
<table class="table table-bordered table-striped">
    <tr>
        <td>x</td>
        <% for(int i = 1; i <= Integer.valueOf(request.getAttribute("cols").toString()); i++) { %>
            <td><%=i%></td>
        <% } %>
    </tr>
    <% for(int i = 1; i <= Integer.valueOf(request.getAttribute("rows").toString()); i++) { %>
        <tr>
        <td><%=i%></td>
        <% for(int j = 1; j <= Integer.valueOf(request.getAttribute("cols").toString()); j++) { %>
            <td><%=j*i%></td>
            <% } %>
        </tr>
    <% } %>
</table>
</body>
</html>
