package com.example.pruebatecnica.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pruebatecnica.model.Persona;
import com.example.pruebatecnica.service.serviceimpl.ServiceImpl;
@RestController
//Pregunta 3
//aqui creamos una firma que es global para todos los endpoit el cual se usa para acceder a todos los metodos(endpoit)
@RequestMapping("/persona")
public class Controller {
    @Autowired
    private ServiceImpl service;
    //Pregunta 1
    //aqui se obtiene la lista ordenada por dni y luego por apellido paterno en caso de que dos o mas dni coincidan
    @GetMapping("/luna")
    public List<Persona>persona(){
        return service.operacion();
    }

//Pregunta 2
//aqui obtenemos un metodo que recibe un parametro de tipo String nombre con el cual obtenemos diferentes comportamientos
@GetMapping("/{nombre}")
public String distribucion(@PathVariable String nombre){
    String respuesta="";
    if("ICA".equalsIgnoreCase(nombre)){
        respuesta="Comportamiento para ICA";
    }else if("LURIN".equalsIgnoreCase(nombre)){
        respuesta="Comportamiento para LURIN";
    }else if("HUANUCO".equalsIgnoreCase(nombre)){
        respuesta="Comportamiento para HUANUCO";
    }else if("TRUJILLO".equalsIgnoreCase(nombre)){
        return respuesta="Comportamiento para TRUJILLO";
    }else{
        respuesta="Centro de distribucion no encontrado";
    }
    return respuesta;
}

@GetMapping("/comportamiento2/{nombre}")
public String comportamiento2(@PathVariable String nombre){
    String respuesta="";
    if("LIMA".equalsIgnoreCase(nombre)){
        respuesta="Comportamiento para LIMA";
    }else if("ATE".equalsIgnoreCase(nombre)){
        respuesta="Comportamiento para ATE";
    }else if("LA VICTORIA".equalsIgnoreCase(nombre)){
        respuesta="Comportamiento para LA VICTORIA";
    }else if("CAÑETE".equalsIgnoreCase(nombre)){
        respuesta="Comportamiento para LA VICTORIA";
    }else{
        respuesta="Centro de distribucion no encontrado";
    }
    return respuesta;
}
}