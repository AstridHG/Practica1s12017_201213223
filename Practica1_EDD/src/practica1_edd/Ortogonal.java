/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd;

import javax.swing.JLabel;



public class Ortogonal {
     
   NodoOrtogonal primero;
   NodoOrtogonal ultimo;
   NodoOrtogonal aux;
   NodoOrtogonal aux1;
   
    
     public void listain(){
         primero=null;
         ultimo=null;
     }
        public void listai(NodoOrtogonal nuevo){
           
           if(primero==null){
               primero=nuevo;//primero es el nuevo
               ultimo=nuevo;// ultimo es nuevo
               
           }else if(nuevo.posx < primero.posx && nuevo.posy < nuevo.posy){ //si nuevo en x es menor que el primero en x
               primero.izquierda = nuevo;//se hace apuntador del primero a la izquierda
               nuevo.derecha=primero;// se hace el apuntador del nuevo a la derecha y se une
               primero=primero.izquierda;
               
               primero.arriba=nuevo;
               nuevo.abajo=primero;
               primero=primero.arriba;
           }
           else if(nuevo.posx>ultimo.posx && nuevo.posy > ultimo.posy){
               ultimo.derecha=nuevo;//ultimo apunta a la derecha
               nuevo.izquierda = ultimo;//nuevo apunta a la izquierda
               ultimo=ultimo.derecha;//el ultimo queda como ultimo apuntador derecha
               nuevo.derecha = null; //nuevo apunta derecha y no hay nada despues
               
               ultimo.abajo = nuevo;
               nuevo.arriba = ultimo;
               ultimo = ultimo.abajo;
               nuevo.abajo = null;
                       
           }else{
               aux=primero;
              
               if(aux.posx < nuevo.posx && aux.posy < nuevo.posy){
                   
               }else{
                   aux1 = aux.izquierda;
                   aux1.derecha = nuevo;
                   aux.izquierda = nuevo;
                   nuevo.derecha = aux;
                   nuevo.izquierda=aux1;
                   
                   aux1=aux.arriba;
                   aux1.abajo = nuevo;
                   aux.arriba=nuevo;
                   nuevo.abajo=aux;
                   nuevo.arriba=aux1;
               }
           }
       }
        
}
        
        
