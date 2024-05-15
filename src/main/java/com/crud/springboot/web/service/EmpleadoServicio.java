package com.crud.springboot.web.servicio;

import com.crud.springboot.web.entidad.Empleado;

import java.util.List;

public interface EmpleadoServicio {
    public List<Empleado> listarEmpleados();
}
