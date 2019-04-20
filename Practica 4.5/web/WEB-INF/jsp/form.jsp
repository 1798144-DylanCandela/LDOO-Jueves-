

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="utf-8">
        <title>>Formulario con Spring MVC</title>
    </head>
    <body>
        <h1>Formulario con Spring MVC</h1>
        
        <form:form>
            <p>
                <form:label path="nombre" >Nombre</form:label>
                <form:input path="nombre" />
            </p>
            <p>
                <form:label path="apellido">Apellido</form:label>
                <form:input path="apellido" />
            </p>
            
            <p>
                <form:label path="correo">Correo</form:label>
                <form:input path="correo" />

            </p>
            <p>
                <form:label path="edad">Edad</form:label>
                <form:input path="edad" />
            </p>
            <hr>
            <form:button >Enviar</form:button>
            
        </form:form>
    </body>
</html>
<!-- Dylan Andres Candela Rodriguez 
     1798144
     LDOO
->