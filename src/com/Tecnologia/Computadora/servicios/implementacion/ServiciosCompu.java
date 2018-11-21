package com.Tecnologia.Computadora.servicios.implementacion;

import com.Tecnologia.Computadora.Computadora;
import com.Tecnologia.Computadora.servicios.servicios.CRUD;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class ServiciosCompu implements CRUD {
    LinkedList<Computadora> listaDeCompus= new LinkedList();

    public boolean agregar(Computadora compu) {
        return listaDeCompus.add(compu); 
        //To change body of generated methods, choose Tools | Templates.
        
    }
    public LinkedList leer(){
    return listaDeCompus;
    }
    
}
