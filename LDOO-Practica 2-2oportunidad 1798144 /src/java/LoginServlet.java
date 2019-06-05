import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
                
            String a = request.getParameter("correo");
            String a1 = request.getParameter("nombre1");
            String a2 = request.getParameter("fecha1");
            String a3 = request.getParameter("nombreusuario");
            String a4 = request.getParameter("password");

            System.out.println("CorreoElectronico : " + a);
            System.out.println("PrimerNombre" + a1);
            System.out.println("FechaDeNacimiento" + a2);
            System.out.println("NombreUsuario"+ a3);
            System.out.println("Contraseña" + a4 );

            PrintWriter writer = response.getWriter();

            String htmlRespnse ="<html>";
            htmlRespnse += "<center><h2> Tu Correo Electronico es: " + a +"<br/>";
            htmlRespnse += "Tu Primer Nombre es : " + a1 + "<br/>";
            htmlRespnse += "Tu FechaDeNacimiento es : " + a2 + "<br/>";
            htmlRespnse += "Tu NombreUsuario es : " + a3 + "<br/>";
            htmlRespnse += "Tu Contraseña es : " + a4 + "</h2>";
            htmlRespnse += "</html>";
            
            writer.println(htmlRespnse);
    }
 
}