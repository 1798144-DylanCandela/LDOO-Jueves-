/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Practica2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dylan Andres Candela Rodriguez 1798144
 */
public class login extends HttpServlet {

Connection con=null;
String user=null;
String pass=null;
String correo=null;
String fecha=null;

    public void init(){
        
        try{
            
            Class.forName("oracle.jdbc.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr"); 
        }
           catch(Exception e){
           
                System.out.println("Error while loading");
           }
    }
    
    public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        
        try{
            
            user=request.getParameter("name");
            pass=request.getParameter("pass");
            correo=request.getParameter("correo");
            fecha=request.getParameter("fecha");
            String q="select * from clientdata where userid="+user+"";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(q);
            String username=null;
            String password=null;
            String correos=null;
            String fechas=null;
            
            while(rs.next()){
                
                    username=rs.getString(2);
                    password=rs.getString(3);
                    correos=rs.getString(2);
                    fechas=rs.getString(2);
                    
            }
            
            if(username.equals(user)&&password.equals(pass)){
                
                System.out.println("Login.succesful");
                
            }else{
            
                System.out.println("login failure");
            }
        }catch(Exception e){
        
        }
    }
          
}
