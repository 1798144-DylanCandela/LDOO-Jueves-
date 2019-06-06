<%-- 
    Document   : Doc
    Created on : 5/06/2019, 12:21:37 PM
    Author     : dylan
--%>
<%@page import="org.springframework.stereotype.Controller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LDOO-Tarea-4</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <div id="table1">

                      <table id="table1" action="Controller" method="post"> 

                        <tr>
                            <td><label>PrimerNombre: </label></td>
                            <td><input type="text" name="nombre1"/></td>
                        </tr>
                        <tr>
                            <td><label>FechaDeNacimiento:  </label></td>
                            <td><input type="date" name="fecha1"/></td>
                        </tr>
                        <tr>
                            <td><label> NombreUsuario:  </label></td>
                            <td><input  type="text" name="nombreusuario"/></td>
                        </tr>
                        <tr>
                            <td><label>CorreoElectronico: </label></td>
                            <td><input type="text" name="correo"/></td>
                        </tr>
                        <tr>
                            <td><label> Contraseña: </label></td>
                            <td><input  type="password" name="password"/></td>
                        </tr>
                          <table>
                               <tr>
                                  <td>
                                  <input href="Login.jsp" type="submit" name="ENTRAR" value="LOG IN"/>
                                    <a href="Registro.jsp">Registrarse</a>
                                    </td>
                                </tr>
                             </table>                          
                       </table>
      </div>
    </body>
</html>
