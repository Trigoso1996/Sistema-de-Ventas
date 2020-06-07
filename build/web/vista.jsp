<%-- 
    Document   : vista
    Created on : 06/06/2020, 08:33:31 PM
    Author     : JUAN CARLOS
--%>

<%
    Double resul = null;
    resul = (Double) request.getAttribute("resul");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Total a Pagar</h1>
        
        <c:forEach items="${Productos}" var="Productos">
            <td>${resul}</td>
        </c:forEach>
    </body>
</html>
