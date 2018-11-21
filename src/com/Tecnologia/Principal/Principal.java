package com.Tecnologia.Principal;

import com.Tecnologia.Computadora.Computadora;
import com.Tecnologia.Computadora.servicios.implementacion.ServiciosCompu;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author danie
 */
public class Principal {
     private static Scanner scanInt= new Scanner(System.in);
     private static Scanner scanString= new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        
    }

    private static void menu() {
       boolean bandera=true;       
       ServiciosCompu servicios= new ServiciosCompu();
        System.out.println("Bienvenido a Tecnologia"+ " Integradora");
       do{
           System.out.println("Ingresa la opcion deseada"
                   +"\n1 Añadir Computadora"
                   +"\n2 Revisar la lista"
                   +"\n3 Modificar"
                   +"\n4 Eliminar"
                   +"\n5 Salir");
           int opcion=scanInt.nextInt();
           switch(opcion){
               case 1:
                   Computadora compu = pedirDatosAUsuario();                   
                   boolean exito =servicios.agregar(compu);
                   if(exito)
                       System.out.println("Se agrego con exito");
                   else System.out.println("Neel morro");
                   
                   break;
               case 2:
                   LinkedList listaDeCompus = servicios.leer();
                   imprimir(listaDeCompus);
                   
                   break;
               case 3:
                   break;
               case 4:
                   break;
               case 5:
                   System.out.println("Ha salido del programa vuelva pronto");
                   bandera=!bandera;
                   break;
               default:
                   break;
           }
       }
       while(bandera);
    }

    private static Computadora pedirDatosAUsuario() {
        System.out.println("Ingrese el numero de serie");
        String noSerie=scanString.nextLine();
        
         System.out.println("Ingrese el año de la computadora");
         int anio=scanInt.nextInt();
         
         System.out.println("Ingrese el modelo");
         String modelo=scanString.nextLine();
        
         System.out.println("Ingrese el procesador");
         String procesador=scanString.nextLine();
        
         System.out.println("Ingrese la RAM");
         int ram=scanInt.nextInt();
         
         Computadora compu=new Computadora(procesador,ram,noSerie,anio,modelo);
         return compu;
         
    }

    private static void imprimir(LinkedList listaDeCompus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
