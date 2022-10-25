
package Modelo;

public class Usuario {
    private String nombre, identificacion, edad;
    public Usuario(String nombre, String id, String edad)
    {
     this.nombre= nombre;
     identificacion=id;
     this.edad=edad;
    }
    public Usuario(){}
    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public String getIdentificacion() {
       return identificacion;
    }
    public void setIdentificacion(String identificacion) {
     this.identificacion = identificacion;
    }
    public String getEdad() {
     return edad;
    }
    public void setEdad(String edad) {
     this.edad = edad;
    }
}
