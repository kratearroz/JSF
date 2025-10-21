package my.app;

import javax.inject.Named;//extencion de la libreria de java
import java.io.Serializable;//funciones basicas de java
import javax.faces.view.ViewScoped;//libreria que importa el viewScoped, Parte del conjunto llamado "alcanze" 

@Named("saludoBean")//el nombre q usaremos para invocar el bean
@ViewScoped//indica cuanto vive el bean recomendable dejarlo como esta
public class SaludoBean implements Serializable {

    private String nombre = "perrito";
    private String mensaje = "";
    private String prueba="";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getPrueba() {
        return prueba;
    }
    

    public void saludar() {
        mensaje = "¡Hola, " + nombre + "! Bienvenido a JSF 😄";
    }
    
}

