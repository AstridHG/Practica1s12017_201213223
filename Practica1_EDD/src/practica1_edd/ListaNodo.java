/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

/**
 *
 * @author Astrid Hernandez
 */
public class ListaNodo {
    
    ListaNodo siguiente;
    String palabra;
    
    public ListaNodo(){
        siguiente = null;
        palabra= null;
    }
    public ListaNodo(String pal){
        palabra = pal;
        siguiente=null;
    }
}
