package com.crud.springboot.web.servicio;

import com.crud.springboot.web.entidad.Empleado;
import com.crud.springboot.web.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicioImplementar implements EmpleadoServicio {
    @Autowired
    private EmpleadoRepositorio repositorio;
    @Override
    public List<Empleado> listarEmpleados() {
        return repositorio.findAll();
    }
}
