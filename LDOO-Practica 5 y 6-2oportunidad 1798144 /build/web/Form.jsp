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
      <meta charset="UTF-8">
      <title>Registrarse</title>
      <script type="text/javascript">
          function verificar(){
             
              var caracter_invalido = " ";
              
              var password = document.login.password.value;
              var pass = document.login.pass.value;
              
              if(password != pass){
                  alert("Las contraseñas no son iguales");
                  return false;
              }
              else if(password == '' || pass == ''){
                  alert("introducir la contraseña en los dos campos")
                  return false;
              }
              else{
                  return true;
              }
          }
      </script>
   </head>
 
   <center>
       <h1>Registrarse</h1>
       <form action="Register" method="POST" name="login" onSubmit="return validar()"
            <table>
                <tr>
                    <td>
                        <p>Usuario</p>
                    </td>
                    <td>
                        <input type="text" name="usuario"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Contraseña</p>
                    </td>
                    <td>
                        <input type="password" name="password"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p>Volver a introducir la contraseña</p>
                    </td>
                    <td>
                        <input type="password" name="pass"/>
                    </td>
                </tr>
            </table>
           <table>
               <tr>
                   <td>
                       <input type="submit" name="ENTRAR" value="Enviar"/>
                   </td>
               </tr>
           </table>
       </form>
   </center>
   </body>
</html>