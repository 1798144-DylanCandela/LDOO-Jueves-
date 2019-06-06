<%-- 
    Document   : completo
    Created on : 5/06/2019, 10:28:48 PM
    Author     : dylan

http://leo.ugr.es/elvira/devel/Tutorial/Java/jdbc/basics/retrieving.html
https://es.stackoverflow.com/questions/76160/por-qu%C3%A9-es-necesario-usar-class-fornamecom-mysql-jdbc-driver

--%>
<%--Importacion de Paquetes :0 de Mysql --%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%><%--Para registrarse a la base de datos--%>
<%@page import="java.sql.Statement"%>
<%--Fin de la Importacion de Paquetes Mysql --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LISTADO DE USUARIOS</title>
    </head>
    <body>
        <center>
            <table style="color:darkorange">
                <th>ID</th>
                <th>CORREO</th>
                <th>CONTRASEÑA</th>
                <th>NOMBRE</th>
                <th>PRIMER APELLIDO</th>
                <th>SEGUNDO APELLIDO</th>            
            </table>
     <%---implementacion de codigo jdbc---%>
     <%---En la parte de Class.forName("com.mysql.jdb.Driver")
          Lo que se esta haciendo es registra el driver de conexión para la base de datos
          para poder conectarse a la base de datos
        ---%>
     <% 
         Connection cnx=null;
         Statement sta=null;
         ResultSet rs=null;
         
         try{
              Class.forName("com.mysql.jdbc.Driver");
              cnx= DriverManager.getConnection("JDBC:mysql//localhost:3306/TareaJDBC", "root", "JeanLugoRoot");
              sta=cnx.createStatement();
              rs=sta.executeQuery("select * from Usuarios");
              while(rs.next()){
                  %>
                  <tr
         <%--lo que hace este comando es contenedor todo lo que llevan las filas --%>
                    <th><%=rs.getString(1)%></th> 
                    <th><%=rs.getString(2)%></th>
                    <th><%=rs.getString(3)%></th>
                  </tr>
                  <%
            }
            sta.close();
            rs.close();
            cnx.close();
        }catch(Exception e){

        }
        %>
        <%--lo que hace este comando cerrar el proceso de guardado por lo que tengo entendido
        --%>
        </center>
    </body>
</html>
