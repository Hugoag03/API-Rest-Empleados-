package com.first.api;

import com.first.api.model.actividad2.Empleado;
import com.first.api.repository.actividad2.EmpleadoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FirstApiRestApplication {

	@Autowired
	private EmpleadoRepository empleadoRepository;

	public static void main(String[] args) {

		SpringApplication.run(FirstApiRestApplication.class, args);
	}

	@PostConstruct
	public void init() {
		Empleado empleado1 = new Empleado(1, "Juan", "Pérez", 26, 2200, "juan@gmail.com", 2, 644436789);
		Empleado empleado2 = new Empleado(2, "María", "González", 30, 2500, "maria@gmail.com", 3, 644437890);
		Empleado empleado3 = new Empleado(3, "Pedro", "Martínez", 35, 2800, "pedro@gmail.com", 4, 644438901);
		Empleado empleado4 = new Empleado(4, "Ana", "López", 28, 2300, "ana@gmail.com", 2, 644439012);
		Empleado empleado5 = new Empleado(5, "Carlos", "Sánchez", 32, 2600, "carlos@gmail.com", 3, 644440123);

		empleadoRepository.agregarEmpleados(Arrays.asList(empleado1, empleado2, empleado3, empleado4, empleado5));
	}

}
