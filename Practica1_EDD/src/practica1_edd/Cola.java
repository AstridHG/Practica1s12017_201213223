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
    public int puntos;
    
    public Cola(){
        letra = null;
        siguiente = null;
        anterior = null;
        puntos=0;
        
    }
    public Cola(String letras,int punto){
        letra= letras;
        siguiente=null;
        anterior = null;
        puntos = punto;
    }
}
