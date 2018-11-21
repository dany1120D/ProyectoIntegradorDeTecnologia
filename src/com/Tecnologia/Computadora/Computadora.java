package com.Tecnologia.Computadora;


import com.Tecnologia.Tecnologia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Computadora extends Tecnologia {
    private String procesador;
    private int ram;
    
    public Computadora(String procesador,int ram,String numSerie,int anio,String modelo){
        super(numSerie,anio,modelo);
        this.procesador=procesador;        
        this.ram=ram;
    }
    public Computadora(){
    }
    

    /**
     * @return the procesador
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the ram
     */
    public int getRam() {
        return ram;
    }

    /**
     * @param ram the ram to set
     */
    public void setRam(int ram) {
        this.ram = ram;
    }
    
}
