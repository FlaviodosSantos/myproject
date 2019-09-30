<!DOCTYPE html>
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>MotherFuck Calculator</title>
</head>
<body>

    <h1>MotherFuck Calculator</h1>
        <form action="/myproject/FlavioServlet" method="post">
            Número:<input type="number" name="numero"/><br><br>
            
            
            <input type="submit" value="Enviar"/>
        </form>
</body>
</html>