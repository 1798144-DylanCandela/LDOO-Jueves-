<%-- 
    Document   : Mandar
    Created on : 4/06/2019, 8:53:04 PM
    Author     : Dylan Andres Candela Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Practica 3-Laboratorio de Diseño Orientado a Objetos</title>
    </head>

    <body>
        
        <center>
                <table>
                    <tr>
                        <td><label>CorreoElectronico: </label></td>
                        <td><%=request.getParameter("correo")%></td>
                    </tr>
                    <tr>
                        <td><label>PrimerNombre: </label></td>
                        <td><%=request.getParameter("nombre1")%></td>
                    </tr>
                    <tr>
                        <td><label>FechaDeNacimiento:  </label></td>
                        <td><%=request.getParameter("fecha1")%></td>
                    </tr>
                    <tr>
                        <td><label> NombreUsuario:  </label></td>
                        <td><%=request.getParameter("nombreusuario")%></td>
                    </tr>
                    <tr>
                        <td><label> Contraseña: </label></td>
                        <td><%=request.getParameter("password")%></td>
                    </tr>

                </table>
        </center>


    </body>
</html>
<!--Paginas de ayuda
http://www.forosdelweb.com/f45/pasar-da
tos-html-jsp-273305/
https://ingeniods.wordpress.com/2010/04/18/mi-primer-formulario-jsp/

https://www.javamexico.org/blogs/kaztle_8/04_java_server_pages_%E2%80%93_jsp_parte_1
-->