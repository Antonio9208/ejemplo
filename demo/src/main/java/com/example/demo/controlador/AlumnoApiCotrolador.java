/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controlador;

import com.example.demo.modelo.Personas;
import com.example.demo.servicio.PersonasServicios;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Manuel Arita
 */
@RestController
@RequestMapping(value="/ws/alumno")
public class AlumnoApiCotrolador {
@Autowired
private PersonasServicios servicio;

@GetMapping (value="/")
public List<Personas> getTodos(){
return servicio.getTodos();

}
@GetMapping(value="/{id}")
public Optional<Personas> getValor(@PathVariable Long id){
return servicio.getValor(id);

}

@PostMapping(value="/guardar")
  public Personas guardar (@RequestBody Personas alumno){
  return servicio.guardar(alumno);
  
  } 
  
  @GetMapping(value="/eliminar/{id}")
public Optional<Personas> eliminar(@PathVariable Long id){
Optional<Personas> alumnoEliminado=servicio.getValor(id);
servicio.eliminar(id);        
return alumnoEliminado; 

}
}
