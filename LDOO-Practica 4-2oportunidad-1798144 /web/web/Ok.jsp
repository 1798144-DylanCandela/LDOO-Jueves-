<%-- 
    Document   : Ok
    Created on : 5/06/2019, 12:04:34 PM
    Author     : dylan
--%>
<%@page import="org.springframework.stereotype.Controller"%>
<%@page import="Controlador.Register"%>
<%
   Register register = (Register) request.getSession().getAttribute("register");
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> OK </title>
        <link rel="stylesheet" type="text/css" href="main.css">

    </head>
    <body>
        <h1>- - -Datos de Usuario- - -</h1>
        Nombre:<%=register.getName() +" "+ register.getLastName()+" "+ register.getSeclast()%>
        <br>
        Correo:<%=register.getCorreo()%>
        <br>

    </body>
</html>
