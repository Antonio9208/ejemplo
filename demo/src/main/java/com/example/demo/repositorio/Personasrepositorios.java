/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repositorio;


import com.example.demo.modelo.Personas;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Manuel Arita
 */
public interface Personasrepositorios extends CrudRepository<Personas,Long> {
    
}
