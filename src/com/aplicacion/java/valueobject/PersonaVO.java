/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.java.valueobject;

/**
 *
 * @author willi
 */
public class PersonaVO {
    
    private String idPersona;
    private String documento;
    private String nombre;
    private String apellido;

    public PersonaVO(String idPersona, String documento, String nombre, String apellido) {
        this.idPersona = idPersona;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
