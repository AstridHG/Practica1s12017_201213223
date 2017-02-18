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
public class Cola {
    public Cola siguiente;
    public Cola anterior;
    public String letra;
    
    public Cola(){
        letra = null;
        siguiente = null;
        anterior = null;
        
    }
    public Cola(String letran){
        letra= letran;
        siguiente=null;
        anterior = null;
    }
}
