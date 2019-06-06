<!DOCTYPE html>
<!--
    Dylan Andres Candela Rodriguez      1798144
Paginas de ayuda para la Practica  
http://www.forosdelweb.com/f4/boton-que-redireccione-otra-pagina-500611/
https://aprenderaprogramar.com/index.php?option=com_content&view=article&id=634:objetos-null-en-java-error-javalangnullpointerexception-autoboxing-unbox-objetos-anonimos-cu00668b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
https://www.youtube.com/watch?v=kxOXIVhNbvE
http://pdf.coreservlets.com/?fbclid=IwAR12lljKz-FpmtVa3JHpMb8f48eTZXqOUu30rvoqxObWeRI3_oII7ssFJq0
Presentacion 06 y 07  del Profesor :  Romeo A.Sanchez- Practica 5 y 6 //Cookies y Session
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Inicioo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript">
                function validar(){
                    var nombre= document.getElementById("nombre").value;
                    var ape1= document.getElementById("ape1").value;
                    var contra= document.getElementById("contra").value;


                    if (nombre.length>15) {
                            alert("El nombre puesto es demaciado largo, volver a ingresar otro.");
                            return false;
                    }else if (ape.length>15) {
                            alert("El Apellido puesto es demaciado largo, volver a ingresar otro.");
                            return false;
                    }else if (contra.length<8) {
                            alert("Su contraseña es demasiado corta.");
                            return false;
                    }else 
                        alert("Bienvenido.");		
                }          
        </script>

   </head>
    <body>   
         <div id="formu">
             
                    <form action="Controlador" method="post"> 
                        
                        <fieldset>
                            <table>
                                <table>
                                   <p>Ya tienes una cuenta, haz clic en Login</p>
                                    <tr>
                                        <td>
                                            <p>Usuario</p>
                                            <input type="text" name="usuario"/>
                                        </td>
                                        <td>
                                            <p>Contraseña</p>
                                            <input type="password" name="contrasena"/>
                                        </td>
                                    </tr>
                                </table>
                                <table>
                                   <tr>
                                       <td>
                                           <input href="Login.jsp" type="submit" name="ENTRAR" value="LOG IN"/>
                                           <a href="Registro.jsp">Registrarse</a>
                                       </td>
                                   </tr>
                                </table>
                        </fieldset>
                    </form>
              </div>
    </body>
</html>
