<%-- 

    Dylan Andres Candela Rodriguez      1798144
Paginas de ayuda para la Practica  
http://www.forosdelweb.com/f4/boton-que-redireccione-otra-pagina-500611/
https://aprenderaprogramar.com/index.php?option=com_content&view=article&id=634:objetos-null-en-java-error-javalangnullpointerexception-autoboxing-unbox-objetos-anonimos-cu00668b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
https://www.youtube.com/watch?v=kxOXIVhNbvE
http://pdf.coreservlets.com/?fbclid=IwAR12lljKz-FpmtVa3JHpMb8f48eTZXqOUu30rvoqxObWeRI3_oII7ssFJq0
Presentacion 06 y 07  del Profesor :  Romeo A.Sanchez- Practica 5 y 6 //Cookies y Session
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos</title>
    </head>
    <body>
        <%
        String nombre = request.getParameter("nombredelusuario"); 
        String contraseña = request.getParameter("contraseña");
        
        %>
        

    <%
        out.println("<h1> Confirmar sus datos:</h1>"); 
        out.println("<h2> Nombre: " + nombre + " </h2>"); 
        out.println("<h2> Contraseña: " + contraseña + " </h2>");
        
   
    %>
    </body>
    
    <%
        HttpSession sesion = request.getSession(false);
        session.invalidate();
        
        response.sendRedirect("index.jsp");
%>
</html>
