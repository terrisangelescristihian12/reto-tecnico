package com.example.pruebatecnica.service.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.pruebatecnica.model.Persona;
import com.example.pruebatecnica.service.Services;

@Service
public class ServiceImpl implements Services{
    //Pregunta 1
    //aqui creamos la logica para obtener la lista ordenada por dni y luego por apellido paterno
    public List<Persona>operacion(){
        
        List<Persona>persona=new ArrayList<>();

        persona.add(new Persona("32223344", "Ramirez", "Baldeon"));
        persona.add(new Persona("32223344", "Enrique", "Sosa"));
        persona.add(new Persona("12314320", "De la cruz", "Angeles"));
        persona.add(new Persona("12314320", "Aguilar", "Angeles"));

        Collections.sort(persona, Comparator.comparing(Persona::getDni).thenComparing(Persona::getAppPaterno));
        return persona;
    }
}
