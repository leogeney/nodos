/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.claseprogramcionbook.listassimple;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-18
 */
public class ListasSimple {
    Nodo inicio;
    ListasSimple(){
    inicio = null;
    }
    
    public void insertarInicio(String nombre, int edad, float promedio){
    Nodo nuevo = new Nodo();
    
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);
    nuevo.setEnlace(null);
    if(inicio == null){
    JOptionPane.showMessageDialog(null, "la lista esta vacia");
    inicio = nuevo;
    }else{
    nuevo.setEnlace(inicio);
    inicio = nuevo;
    }
   }
   public void Consultar(){
   Nodo temporal = inicio;
   
   if(inicio == null){
           JOptionPane.showMessageDialog(null, "la lista esta vacia");

   
   }else{
   do{
       
           JOptionPane.showMessageDialog(null, 
                   
                   "nombre" + temporal.getNombre() + temporal.getEdad() + temporal.getPromedio());

       
   }while(temporal.getEnlace()!= null);
   }
   
   } 
    
}
