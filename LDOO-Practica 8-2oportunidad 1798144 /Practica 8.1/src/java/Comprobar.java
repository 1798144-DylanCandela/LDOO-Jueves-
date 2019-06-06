/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dylan
 */
public class Comprobar {
    private String correo;
    private String password;
    private String rcorreo;
    private String rpass;
    private boolean check = false;
        
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRcorreo(String rcorreo) {
        this.rcorreo = rcorreo;
    }

    public void setRpass(String rpass) {
        this.rpass = rpass;
    }
        
    public void validar(){
        if (correo.equals(rcorreo) && password.equals(rpass)) {
            check = true;
        } else { 
            check = false; 
        }
    }

    public String getCorreo() {
        return correo;
    }

    public String getPass() {
        return password;
    }

    public String getRcorreo() {
        return rcorreo;
    }

    public String getRpass() {
        return rpass;
    }
    
    public Boolean getCheck() {
        return check;
    }
}
