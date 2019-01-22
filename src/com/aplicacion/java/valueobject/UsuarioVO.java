/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.java.valueobject;

/**
 *
 * @author Administrador
 */
public class UsuarioVO {
    
    private int idPersona;
    private int id;
    private String nombre;
    private String contra;
    private String permisosB3;

    public UsuarioVO(int idPersona, int id, String nombre, String contra, String permisos) {
        this.idPersona = idPersona;
        this.id = id;
        this.nombre = nombre;
        this.contra = contra;
        this.permisosB3 = permisos;
    }

    public String getPermisos() {
        return permisosB3;
    }

    public void setPermisos(String permisos) {
        this.permisosB3 = permisos;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
    
    
}
