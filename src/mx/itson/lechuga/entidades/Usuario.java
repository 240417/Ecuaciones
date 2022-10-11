/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.lechuga.entidades;

/**
 *
 * @author Jesus
 */
public class Usuario {
    private String nombre;
    private String correoElrctronico;
    private String contraseña;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the correoElrctronico
     */
    public String getCorreoElrctronico() {
        return correoElrctronico;
    }

    /**
     * @param correoElrctronico the correoElrctronico to set
     */
    public void setCorreoElrctronico(String correoElrctronico) {
        this.correoElrctronico = correoElrctronico;
    }

    /**
     * @return the contraseña
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña the contraseña to set
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
