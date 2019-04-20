<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="utf-8">
        <title>>Formulario con JSP</title>
    </head>
    <body>
        <h1>Formulario con JSP</h1>
        
        <form:form>
            <p>
                <form:label path="nombre" >Nombre</form:label>
                <input id="campo1" name="nombre" type="text" />
            </p>
            <p>
                <form:label path="apellido">Apellido</form:label>
                 <input id="campo2" name="apellido" type="text" />
            </p>
            
            <p>
                <form:label path="correo">Correo</form:label>
                 <input id="campo3" name="correo" type="text" />
            </p>
            <p>
                <form:label path="edad">Edad</form:label>
                 <input id="campo4" name="edad" type="text" />
            </p>
            <hr>
            <button>Enviar</button>
            
        </form:form>
    </body>
</html>
<!-- Dylan Andres Candela Rodriguez 
     1798144
     LDOO
->