package modelos;

public class Usuario {

    private int id;
    private String nombre;
    private String correo;
    private int edad;
    private String apellido;

    public Usuario() {

    }

    public Usuario(String nombre, String correo, int edad, String apellido) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
/*Dylan Andres Candela Rodriguez 
     1798144
     LDOO
*/

