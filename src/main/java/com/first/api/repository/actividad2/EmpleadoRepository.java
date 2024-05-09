package com.first.api.repository.actividad2;

import com.first.api.model.actividad2.Empleado;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpleadoRepository {

    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleados(List<Empleado> nuevosEmpleados) {
        empleados.addAll(nuevosEmpleados);
    }

    public Empleado save(Empleado e){
        Empleado empleado1 = new Empleado();
        empleado1.setId(e.getId());
        empleado1.setNombre(e.getNombre());
        empleado1.setApellido(e.getApellido());
        empleado1.setEdad(e.getEdad());
        empleado1.setSueldo(e.getSueldo());
        empleado1.setAnosExperiencia(e.getAnosExperiencia());
        empleado1.setTelefono(e.getTelefono());
        empleado1.setEmail(e.getEmail());
        empleados.add(empleado1);
        return empleado1;
    }

    public List<Empleado> findAllEmpleados(){
        return empleados;
    }

    public Empleado updateEmpleado(Empleado e){
        int id = 0;
        int idPos = 0;

        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getId() == e.getId()){
                id = empleados.get(i).getId();
                idPos = i;
                break;
            }
        }

        Empleado empleado1 = new Empleado();
        empleado1.setId(e.getId());
        empleado1.setNombre(e.getNombre());
        empleado1.setApellido(e.getApellido());
        empleado1.setEdad(e.getEdad());
        empleado1.setSueldo(e.getSueldo());
        empleado1.setAnosExperiencia(e.getAnosExperiencia());
        empleado1.setTelefono(e.getTelefono());
        empleado1.setEmail(e.getEmail());
        empleados.set(idPos, empleado1);

        return empleado1;
    }

    public String deleteEmpleado(int id){
        empleados.removeIf(x -> x.getId() == id);
        return null;

    }

    public Empleado findById(int id){
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getId() == id){
                return empleados.get(i);
            }
        }
        return null;
    }

    public Empleado findByEmail(String email){
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getEmail().equals(email)){
                return empleados.get(i);
            }
        }
        return null;
    }

    public List<Empleado> findSueldo1000(double sueldo){
        List<Empleado> empleadosSueldo = new ArrayList<>();
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getSueldo() > sueldo){
                empleadosSueldo.add(empleados.get(i));
            }
        }
        return empleadosSueldo;
    }

    public List<Empleado> findExperiencia5(int experiencia){
        List<Empleado> empleadosExperiencia = new ArrayList<>();
        for(int i = 0; i < empleados.size(); i++){
            if(empleados.get(i).getAnosExperiencia() > experiencia){
                empleadosExperiencia.add(empleados.get(i));
            }
        }
        return empleadosExperiencia;
    }
}
