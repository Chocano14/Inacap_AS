package Beans;

/**
 * Created by pablo on 06-06-2016.
 */
public class Alumno
{
    private String Rut;
    private String Nombre;
    private String Contraseña;
    private String Correo;
    private String Carrera_Id;

    public Alumno(String rut, String nombre, String contraseña, String correo, String carrera_Id) {
        Rut = rut;
        Nombre = nombre;
        Contraseña = contraseña;
        Correo = correo;
        Carrera_Id = carrera_Id;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String rut) {
        Rut = rut;
    }

    public String getCarrera_Id() {
        return Carrera_Id;
    }

    public void setCarrera_Id(String carrera_Id) {
        Carrera_Id = carrera_Id;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
