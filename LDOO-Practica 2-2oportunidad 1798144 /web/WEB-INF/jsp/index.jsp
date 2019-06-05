<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>

        <head>
            <meta charset="utf-8">
            <title>Page Title</title>
            <link rel="stylesheet" type="text/css" media="screen" href="main.css">
            <script src="loginServlet.java"></script>

        </head>

        <body>
       
                <form name="loginForm" method="post" action="loginServlet">
                        CorreoElectronico: <input type="text_line" name="correo">
                        PrimerNombre: <input type="text_line" name="nombre1">
                        FechaDeNacimiento: <input type="date" name="fecha1">

                        NombreUsuario: <input type="text" name="nombreusuario"/> <br/>
                        Contraseña: <input type="password" name="password"/> <br/>
                        <input type="submit" value="Login" />
                    </form>

        </body>
</html>
