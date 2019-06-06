
/**
 *
 * @author dylan
 */
//Importacion de paquetes necesarios insluso de Mysql
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//^^^^^^^ Paquetes De Mysql ^^^^
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//Iniciacilizacion de la Web

@WebServlet(name="Controller" , urlPatterns ={"/Controller"})
public class Controller extends HttpServlet{
        

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
            
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet Registro</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Registro at " + request.getContextPath() + "</h1>");
                out.println("</body>");
                out.println("</html>");
            }
    }
// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        processRequest(request,response);
    }
    
        /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
            PrintWriter out = response.getWriter();
            
            String sv= request.getParameter("controlardor");
            if("1".equals(sv)){
                    String nombre = request.getParameter("nombre");
                    String apellido11 = request.getParameter("apellido1");
                    String apellido22 = request.getParameter("apellido2");
                    String correo1= request.getParameter("correo");
                    String password1= request.getParameter("password");
            
            if(nombre.equals("") || apellido11.equals("") || correo1.equals("") || apellido22.equals("") || correo1.equals("")){
               request.getRequestDispatcher("Eror.html").forward(request, response);
            }else{
                    Register registros= new Register();
                    registros.setNombre1(nombre);
                    registros.setApellido11(apellido11);
                    registros.setApellido22(apellido22);
                    registros.setCorreo1(correo1);
                    registros.setPassword(password1);
                    
                    Connection cnx;
                    Statement sta;
                    
                    String insertar = "INSERT INTO USUARIOS (nombre, apellidop, apellidom, correo, contras)";
                        
                    int nu=0;
                    
                    try {   
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        cnx=DriverManager.getConnection("jdbc:derby://localhost:1527/Practica8.1", "root", "root");
                        sta=cnx.createStatement();

                        sta.executeUpdate(insertar + "VALUES ('"+ nombre +"', '" + apellido11 + "', '" + apellido22 + "', '" + correo1 + "', '" + password1 + "')");

                        sta.close();
                        cnx.close();
                    }catch (ClassNotFoundException | SQLException e) {
                            request.getRequestDispatcher("Error.html").forward(request, response);
                    }

                     out.println("<!DOCTYPE html>");
                     out.println("<html>");
                     out.println("<head>");
                     out.println("<title> Registro completo... </title>");
                     out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">");
                     out.println("</head>"); 
                     out.println("<body>");
                     out.println("<fieldset id=\"texto\">");
                     out.println("<legend>Sus datos son: </legend>");
                     out.println("Nombre: " +nombre);
                     out.println("<br>");
                     out.println("Apellido paterno: " +apellido11);
                     out.println("<br>");
                     out.println("Apellido materno: " +apellido22);
                     out.println("<br>");
                     out.println("Correo: " +correo1);
                     out.println("<br>");
                     out.println("Contraseña" + password1);
                     out.println("<br>"); 
                     out.println("<a href='Login.html'>Inicie sesión</a>");
                     out.println("</tabl>");
                     out.println("</body>"); 
                     out.println("</html>"); 
                     }
                 }else{

                     String corre = request.getParameter("correo");
                     String pass = request.getParameter("password");

                     Comprobar co = new Comprobar();
                     Cliente cl = new Cliente();

                     co.setCorreo(corre);
                     co.setPassword(pass);


                     try{
                         Connection cnx;
                         Statement sta;
                         ResultSet rs;

                         Class.forName("org.apache.derby.jdbc.ClientDriver");
                         cnx=DriverManager.getConnection("jdbc:derby://localhost:1527/Practica8.1", "root", "root");
                         sta=cnx.createStatement();
                         rs= sta.executeQuery("SELECT * FROM usuarios");

                         while(rs.next()){
                             String cocorreo = rs.getString("correo");
                             String cocontras = rs.getString("contras");

                             if (cocorreo.equals(corre) & cocontras.equals(pass)) {
                                 co.setRcorreo(cocorreo);
                                 co.setRpass(cocontras);
                                 cl.setID(rs.getInt("idusuario"));
                                 cl.setNombe(rs.getString("nombre"));
                                 cl.setApp11(rs.getString("apellido11"));
                                 cl.setApp22(rs.getString("apellido22"));
                             }
                         }    

                     }catch (ClassNotFoundException | SQLException e){
                         request.getRequestDispatcher("Error.html").forward(request, response);
                     }
                     co.validar();
                     if (co.getCheck()){
                         Cookie micookie = new Cookie("Loggeo","Exitoso");
                         micookie.setMaxAge(60*60*24);

                         out.println("<!DOCTYPE html>");
                         out.println("<html>");
                         out.println("<head>");
                         out.println("<title> Bienvenido... </title>");
                         out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">");
                         out.println("</head>"); 
                         out.println("<body>");
                         out.println("<fieldset id=\"texto\">");
                         out.println("<legend>Ha iniciado sesión exitosamente: </legend>");
                         out.println("Bienvenido"); 
                         out.println("<table border='0'>");
                         out.println("<tr>");
                         out.println("<td>Su nombre es: </td>");
                         out.println("<td>" +cl.getNombe()+ "</td>");
                         out.println("<td>" +cl.getApp11()+ "</td>");
                         out.println("<td>" +cl.getApp22()+ "</td>");
                         out.println("</tr>");
                         out.println("<td>Su ID es: " +cl.getID()+ "</td>");
                         out.println("</table>");
                         out.println("<br>Cookie: " );
                         out.println(micookie.getName() + " " + micookie.getValue());
                         out.println("<br>");
                         out.println("<br><a href='Registro.html'>Inicio</a>");
                         out.println("</fieldset>");

                         out.println("</body>"); 
                         out.println("</html>"); 

                     } else { 
                         out.println("<!DOCTYPE html>");
                         out.println("<html>");
                         out.println("<head>");
                         out.println("<title> Oh oh... </title>");
                         out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"main.css\">");
                         out.println("</head>"); 
                         out.println("<body>");
                         out.println("<fieldset>");
                         out.println("<legend>Ha ocurrido un error: </legend>");
                         out.println("<br> <a href='Registro.html'>Inicio</a>");
                         out.println("</fieldset>");
                         out.println("</body>"); 
                         out.println("</html>"); 
                     }
                 }
             }




             /**
              * Returns a short description of the servlet.
              *
              * @return a String containing servlet description
              */
         }

