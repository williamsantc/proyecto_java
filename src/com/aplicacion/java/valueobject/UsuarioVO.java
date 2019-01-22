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

    public UsuarioVO(int idPersona, int id, String nombre, String contra) {
        this.idPersona = idPersona;
        this.id = id;
        this.nombre = nombre;
        this.contra = contra;
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
