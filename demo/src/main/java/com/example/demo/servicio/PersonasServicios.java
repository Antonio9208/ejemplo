/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.servicio;

import com.example.demo.modelo.Personas;
import com.example.demo.repositorio.Personasrepositorios;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Manuel Arita
 */
@Service
public class PersonasServicios {
    @Autowired
   private Personasrepositorios repositorio;  
    public Personas guardar(Personas entidad){
      return repositorio.save(entidad);
    }
    public void eliminar(Long id){
    repositorio.deleteById(id);
    
    }
    public Optional<Personas> getValor(Long id){
    return repositorio.findById(id);
    
    }
    public List<Personas> getTodos(){
    return (List<Personas>)repositorio.findAll();
    
    } 
}
