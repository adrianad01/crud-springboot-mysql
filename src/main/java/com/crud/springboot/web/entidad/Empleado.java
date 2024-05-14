package com.crud.springboot.web.entidad;

import jakarta.persistence.*;

//CREACION DE LA TABLA Y DE LAS COLUMNAS DE LA BASE DE DATOS
@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nombreEmpleado", nullable = false, length = 100)
    private String nombreEmpleado;

    @Column (name = "apellidoEmpleado", nullable = false, length = 100)
    private String apellidoEmpleado;

    @Column (name = "edadEmpleado", nullable = false)
    private int edadEmpleado;

    @Column (name = "emailEmpleado", nullable = false, length = 255, unique = true)
    private String emailEmpleado;

    @Column (name = "puestoEmpleado", nullable = false, length = 100)
    private String puestoEmpleado;

    @Column (name = "antiguedadEmpleado", nullable = false, length = 50)
    private String antiguedadEmpleado;

    //CONSTRUCTIOR VACIO
    public Empleado() {
    }

    //CONSTRUCTOR
    public Empleado(Long id, String nombreEmpleado, String apellidoEmpleado, int edadEmpleado, String emailEmpleado, String puestoEmpleado, String antiguedadEmpleado) {
        this.id = id;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.edadEmpleado = edadEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.puestoEmpleado = puestoEmpleado;
        this.antiguedadEmpleado = antiguedadEmpleado;
    }

    //GETTERS & SETTERS
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public int getEdadEmpleado() {
        return edadEmpleado;
    }

    public void setEdadEmpleado(int edadEmpleado) {
        this.edadEmpleado = edadEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public String getPuestoEmpleado() {
        return puestoEmpleado;
    }

    public void setPuestoEmpleado(String puestoEmpleado) {
        this.puestoEmpleado = puestoEmpleado;
    }

    public String getAntiguedadEmpleado() {
        return antiguedadEmpleado;
    }

    public void setAntiguedadEmpleado(String antiguedadEmpleado) {
        this.antiguedadEmpleado = antiguedadEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", apellidoEmpleado='" + apellidoEmpleado + '\'' +
                ", edadEmpleado=" + edadEmpleado +
                ", emailEmpleado='" + emailEmpleado + '\'' +
                ", puestoEmpleado='" + puestoEmpleado + '\'' +
                ", antiguedadEmpleado='" + antiguedadEmpleado + '\'' +
                '}';
    }
}
