<!---
    Dylan Andres Candela Rodriguez
    1798144

-->

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>INICIO DE SESIÓN</title>

    </head>
    <body>
        <div>
            <form action="Controller" id="form" method="post"> 
                <fieldset>
                    <tr>
                        <td><label>Iniciar Sesion</label></td>
                    </tr>
                    <tr>
                        <td><label>Correo : </label></td>
                        <td><input type="text" name="correo2"/></td>
                    </tr>
                    <tr>
                        <td><label> Contraseña:  </label></td>
                        <td><input  type="password" name="contra2"/></td>
                    </tr>

                    <tr>
                        <td><input  type="submit" value="Entrar" /></td>
                    </tr>
                </fieldset>              
            </form>

        </div>
        
    </body>
</html>
