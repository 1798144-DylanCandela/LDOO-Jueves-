/*

    Dylan Andres Candela Rodriguez          1798144
Paginas de ayuda para la Practica  
http://www.forosdelweb.com/f4/boton-que-redireccione-otra-pagina-500611/
https://aprenderaprogramar.com/index.php?option=com_content&view=article&id=634:objetos-null-en-java-error-javalangnullpointerexception-autoboxing-unbox-objetos-anonimos-cu00668b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
https://www.youtube.com/watch?v=kxOXIVhNbvE
http://pdf.coreservlets.com/?fbclid=IwAR12lljKz-FpmtVa3JHpMb8f48eTZXqOUu30rvoqxObWeRI3_oII7ssFJq0
Presentacion 06 y 07  del Profesor :  Romeo A.Sanchez- Practica 5 y 6 //Cookies y Session

 */
package Cliente;

/**
 *
 * @author dylan
 */
public final class Cliente {
    
    private String usuario;
    private String password;
   
    
    public Cliente(){
        setUsuario(usuario);
        setPassword(password);
    }
    
    public Cliente(String usuario, String password){
        setUsuario(usuario);
        setPassword(password);
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    

}
