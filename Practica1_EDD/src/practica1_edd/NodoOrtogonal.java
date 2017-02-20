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
public class NodoOrtogonal {
    
    int posx,posy;
    String dato;
    
  NodoOrtogonal arriba;
  NodoOrtogonal abajo;
  NodoOrtogonal izquierda;
  NodoOrtogonal derecha;

  
 public NodoOrtogonal(){
      arriba= null;
      abajo=null;
      izquierda=null;
      derecha = null;
 }
      public NodoOrtogonal(String dato, int x , int y){
       this.dato=dato;
       this.posx=x;
       this.posy=y;
       
      }
      
    
  }
  
 
      
      
      
      


