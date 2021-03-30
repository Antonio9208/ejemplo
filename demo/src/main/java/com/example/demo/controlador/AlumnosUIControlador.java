/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controlador;

import com.example.demo.modelo.Personas;
import com.example.demo.servicio.PersonasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Manuel Arita
 */

@Controller
public class AlumnosUIControlador {
    @Autowired 
 private PersonasServicios servicio;
 @RequestMapping("/")
 public String Personas(Model model){
 setParametro(model,"lista",servicio.getTodos());
 return "Personas";
 
 }
 @GetMapping("/crear")
 public String irCrear(Model model){
 setParametro(model, "alumno", new Personas());
 return "alumno";
 }
 @GetMapping("/actualizar/{id}")
 public String irActualizar(@PathVariable("id") Long id, Model model){
 setParametro(model,"alumno", servicio.getValor(id));
 return "alumno";
 }
 @PostMapping("/guardar")
 public String guardar(Personas alumno, Model model){
 
 servicio.guardar(alumno);
 return "redirect:/";
 }
 @GetMapping("/eliminar/{id}")
 public String eliminar(@PathVariable("id") Long id,Model model){
 servicio.eliminar(id);
 return "redirect:/";
 }
 
 public void setParametro(Model model, String atributo, Object valor){
 model.addAttribute(atributo, valor);
 
 }
}
