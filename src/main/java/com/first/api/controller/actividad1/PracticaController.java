package com.first.api.controller.actividad1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operaciones")
public class PracticaController {

    @GetMapping("/hola")
    public String holaATodos(){
        return "Hola a todos, esta API realiza operaciones matemáticas";
    }

    @GetMapping("/suma")
    public String suma(@RequestParam("num1") int num1, @RequestParam("num2") int num2){

        int suma = num1 + num2;

        return "El resultado de " + num1 + " + " + num2 + " = " + suma;
    }

    @GetMapping("/resta")
    public String resta(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int resta = num1 - num2;

        return "El resultado de " + num1 + " - " + num2 + " = " + resta;
    }

    @GetMapping("/multi")
    public String multiplicacion(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int multi = num1 * num2;


        return "El resultado de " + num1 + " x " + num2 + " = " + multi;
    }

    @GetMapping("/div")
    public String division(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        int div = num1 / num2;

        if(num2 == 0){
            return "No se puede dividir un número entre 0";
        }else{
            return "El resultado de " + num1 + " / " + num2 + " = " + div;
        }
    }

    @GetMapping("/calcularMayor")
    public String calcularMayor(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        if(num1 > num2){
            return "El número " + num1 + " es mayor (>) que el número " + num2;
        }else if(num2 > num1){
            return "El número " + num2 + " es mayor (>) que el número " + num1;
        }else{
            return "Ambos números son iguales";
        }
    }
}
