/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import java.util.Date;

/**
 *
 * @author jeffe
 */
public class Persona {
    
 private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String dirreccion;
    private Date   fechanacimeinto;
    private String correo;

    public Persona(String nombre1, String nombre2, String apellido1,
            String apellido2, String dirreccion, Date fechanacimeinto, String correo) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dirreccion = dirreccion;
        this.fechanacimeinto = fechanacimeinto;
        this.correo = correo;
    }

    public Persona() {
        
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public Date getFechanacimeinto() {
        return fechanacimeinto;
    }

    public void setFechanacimeinto(Date fechanacimeinto) {
        this.fechanacimeinto = fechanacimeinto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Object getFechaNacimiento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
     
    