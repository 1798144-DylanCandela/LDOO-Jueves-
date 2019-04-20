
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultados del Formulario</h1>
        
        <ul>
            
            <li>Nombre: <c:out value="${nombre}"/></li>
            <li>Apellido: <c:out value="${apellido}"/></li>
            <li>Correo: <c:out value="${correo}"/></li>
            <li>Edad: <c:out value="${edad}"/></li>
        </ul>
    </body>
</html>

<!-- Dylan Andres Candela Rodriguez 
     1798144
     LDOO
->