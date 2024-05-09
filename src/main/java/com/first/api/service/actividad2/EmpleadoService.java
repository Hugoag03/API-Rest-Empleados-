package com.first.api.service.actividad2;

import com.first.api.model.actividad2.Empleado;
import com.first.api.repository.actividad2.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    public List<Empleado> mostrarTodos(){
        return empleadoRepository.findAllEmpleados();
    }

    public Empleado guardarEmpleado(Empleado empleado){
        return empleadoRepository.save(empleado);
    }

    public Empleado actualizarEmpleado(Empleado empleado){
        return empleadoRepository.updateEmpleado(empleado);
    }

    public Empleado buscarPorId(int id){
        return empleadoRepository.findById(id);
    }

    public Empleado buscarPorEmail(String email){
        return empleadoRepository.findByEmail(email);
    }

    public List<Empleado> buscarPorSueldoMayorA(double sueldo){
        return empleadoRepository.findSueldo1000(sueldo);
    }

    public List<Empleado> buscarPorExperienciaMayorA(int experiencia){
        return empleadoRepository.findExperiencia5(experiencia);
    }

    public String eliminarEmpleado(int id){
        empleadoRepository.deleteEmpleado(id);

        return "El empleado ha sido eliminado !! " + id;
    }
}
