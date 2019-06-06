/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author dylan
 */
 
public class Register {
    private String name;
    private String lastname;
    private String seclast;
    private String correo;
    private String password;

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setLastName (String lastname) {
        this.lastname = lastname;
    }
    
    public String getLastName() {
        return lastname;
    }

    public void setSeclast(String seclast) {
        this.seclast = seclast;
    }
    
    public String getSeclast() {
        return seclast;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
}