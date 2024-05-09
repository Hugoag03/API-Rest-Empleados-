package com.first.api.controller.actividad2;

import com.first.api.model.actividad2.Empleado;
import com.first.api.service.actividad2.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> listarTodos(){
        return empleadoService.mostrarTodos();
    }

    @PostMapping
    public Empleado agregarEmpleado(@RequestBody Empleado empleado){
        return empleadoService.guardarEmpleado(empleado);
    }

    @GetMapping("{id}")
    public Empleado buscarPorId(@PathVariable int id){
        return empleadoService.buscarPorId(id);
    }

    @GetMapping("/email/{email}")
    public Empleado buscarPorEmail(@PathVariable String email){
        return empleadoService.buscarPorEmail(email);
    }

    @GetMapping("/sueldo/{sueldo}")
    public List<Empleado> buscarPorSueldoMayorA(@PathVariable double sueldo){
        return empleadoService.buscarPorSueldoMayorA(sueldo);
    }

    @GetMapping("/exp/{experiencia}")
    public List<Empleado> buscarPorExperienciaMayorA(@PathVariable int experiencia){
        return empleadoService.buscarPorExperienciaMayorA(experiencia);
    }

    @PutMapping
    public Empleado actualizarEmpleado(@RequestBody Empleado empleado){
        return empleadoService.actualizarEmpleado(empleado);
    }

    @DeleteMapping("{id}")
    public String eliminarEmpleado(@PathVariable int id){
        return empleadoService.eliminarEmpleado(id);
    }


}
