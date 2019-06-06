<%-- 

    Dylan Andres Candela Rodriguez      1798144
Paginas de ayuda para la Practica  
http://www.forosdelweb.com/f4/boton-que-redireccione-otra-pagina-500611/
https://aprenderaprogramar.com/index.php?option=com_content&view=article&id=634:objetos-null-en-java-error-javalangnullpointerexception-autoboxing-unbox-objetos-anonimos-cu00668b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
https://www.youtube.com/watch?v=kxOXIVhNbvE
http://pdf.coreservlets.com/?fbclid=IwAR12lljKz-FpmtVa3JHpMb8f48eTZXqOUu30rvoqxObWeRI3_oII7ssFJq0
Presentacion 06 y 07  del Profesor :  Romeo A.Sanchez- Practica 5 y 6 //Cookies y Session
--%>

<%@page import="Cliente.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
        HttpSession sesion = request.getSession();
        String usuario;
        String password;
        usuario = sesion.getAttribute("username").toString();
        password = sesion.getAttribute("password").toString();
        Cliente C = new Cliente(usuario,password);
%> 

<!--
Sirve para poder obtener los datos de la clase cliente y poder imprmirlos en cuando se
seleccine las cookies
-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>Bienvenido!!</title>
        <script>
            
        </script>
    </head>
  
    <center>
        <h1>Bienvenido, <%=C.getUsuario()%>!</h1>
        </br>
         </br>
          </br>
           </br>
        <br>
        <a href="COOKIE">
            <input type="submit" value="Revisar cookies" name="Revisar cookies"/>               
        </a>
        <form action="cerrarSesion.jsp">
            <input type="submit" name="CERRAR SESIÓN" value="CERRAR SESIÓN"/>
            <p> Tu contraseña es: <%= C.getPassword()%> </p>
        </form>
        <br>
        
    </center>
    </body>
</html>
