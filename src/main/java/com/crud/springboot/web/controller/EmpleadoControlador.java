package com.crud.springboot.web.controller;

import com.crud.springboot.web.servicio.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmpleadoControlador {
    @Autowired
    private EmpleadoServicio servicio;

    @GetMapping("/empleados")
    public String listarEmpleados(Model modelo){
        modelo.addAttribute("empleados", servicio.listarEmpleados());
        return "empleados"; //Regresa el archivo empleados
    }
}
